/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.*;
import rminewserver.Database;
import rminewserver.User;

/**
 *
 * @author notebook
 */
public class UserInterfaceTest {

    Database db;
    UserInterface instance;

    public UserInterfaceTest() throws RemoteException {
        db = new Database();
        db.GetCollection("User");
        instance = new User(db);
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // testing the sign up to add a new user 
    @Test
    public void testAddnewUser() throws Exception {
        System.out.println("Add New User");
        int userID = 1323;
        String UserName = "Mohamed";
        String Password = "mohamed1234";
        String Email = "mohamed@gmail.com";
        boolean expResult = true;
        boolean result = instance.AddnewAccount(userID, UserName, Password, Email);
        assertEquals(expResult, result);
    }

    // testing the sign up to add a user that already exists in the database
    
    @Test
    public void testAddnewUserFail() throws Exception {
        System.out.println("failed to add a new user");
        int userID = 1;
        String UserName = "rowan";
        String Password = "rowan1234";
        String Email = "rowan@gmail.com";
        boolean expResult = true;
        boolean result = instance.AddnewAccount(userID, UserName, Password, Email);
        assertNotEquals(expResult, result);
    }

    /**
     * testing the login 
     */
    @Test
    public void testLogin() throws Exception {
        String UserName = "reem";
        String Password = "reem1234";
        instance = new User(db);
        int expResult = 91;
        int result = instance.Login(UserName, Password);
        assertEquals(expResult, result);
    }

    // testing the login with a wrong username
    @Test
    public void testLoginFail() throws Exception {
        System.out.println("Login");
        String UserName = "farah";
        String Password = "farah1234";
        int expResult = 1;
        int result = instance.Login(UserName, Password);
        assertNotEquals(expResult, result);

    }

    
    // testing the edit user account of an already existing account
    @Test
    public void testEditUser() throws RemoteException {
        System.out.println("Edit User");
        int id = 0;
        
        String Username = "sheroq";
        String NewUsername = "sheroqhesham";
        String Password = "sheroq1234";
        String NewPassword = "sheroq4321";
        String Email = "sheroq@gmail.com";
        instance = new User(db);
        boolean expResult = true;
        boolean result = instance.EditAccount(id, Username, NewUsername, Password, NewPassword, Email);
        assertEquals(expResult, result);
    }

    // testing the edit user account with a non existing account
    @Test
    public void testEditUserFail() throws Exception {
        System.out.println("Edit User");
        int id = 2;
        String Username = "mostafa";
        String NewUsername = "mostafaamin";
        String Password = "mostafa1234";
        String NewPassword = "mostafa4321";
        String Email = "mostafa@gmail.com";
        boolean expResult = true;
        boolean result = instance.EditAccount(id, Username, NewUsername, Password, NewPassword, Email);
        assertNotEquals(expResult, result);

    }


    public class AccountInterfaceImpl implements AccountInterface {

        public boolean AddnewUser(int userID, String UserName, String Password, String Email) throws RemoteException {
            return false;
        }

        public int Login(String UserName, String Password) throws RemoteException {
            return 0;
        }

        public boolean EditUser(int id, String Username, String NewUsername, String Password, String NewPassword, String Email) throws RemoteException {
            return false;
        }
    }

}
