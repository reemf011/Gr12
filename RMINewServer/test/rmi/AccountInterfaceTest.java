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
import static org.junit.Assert.*;
import rminewserver.Database;
import rminewserver.User;

/**
 *
 * @author notebook
 */
public class AccountInterfaceTest {

    Database db;
    AccountInterface instance;

    public AccountInterfaceTest() throws RemoteException {
        db = new Database();
        db.GetCollection("Account");
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

    /**
     * Test of AddnewAccount method, of class AccountInterface.
     */
    @Test
    public void testAddnewAccount() throws Exception {
        //System.out.println("AddnewAccount");
        //String username = "abacdcbasdicsc";
        //String password = "12711112";
        //String Email = "aincidjca";
        //String type = "Student";
        //boolean expResult = true;
        //boolean result = instance.AddnewAccount(username, password, Email, type);
        //assertEquals(expResult, result);
    }

    /*test case 2: here we are trying to input a username that already exsists in the database
      - To test enter an existing account 
    */
    
    @Test
    public void testAddnewAccountFail() throws Exception {
        //System.out.println("AddnewAccountFail");
        //String username = "Sameh182052@bue.edu.eg";
        //String password = "4689234";
        //String Email = "Sameh182052@bue.edu.eg";
        //String type = "Student";
        //boolean expResult = true;
        //boolean result = instance.AddnewAccount(username, password, Email, type);
        //assertNotEquals(expResult, result);
    }

    /**
     * Test of Login method, of class AccountInterface.
     */
    @Test
    public void testLogin() throws Exception {
        //System.out.println("Login");
        //String user = "Dragon@bue.edu.eg";
        //String pass = "8719201";
        //String type = "TeachingAssistant";
        //instance = new User(db);
        //int expResult = 91;
        //int result = instance.Login(user, pass, type);
        //assertEquals(expResult, result);
    }

    // Test case 2: Inputing a wrong user.
    @Test
    public void testLoginFail() throws Exception {
//        System.out.println("Login");
//        String user = "Mohammedraja";
//        String pass = "1234567";
//        String type = "Student";
//        int expResult = 1;
//        int result = instance.Login(user, pass, type);
//        assertNotEquals(expResult, result);

    }

    
    
    /**
     * Test of EditAccount method, of class AccountInterface.
     * 
     */
    /*
        - To test enter an existing account 
    */
    @Test
    public void testEditAccount() throws RemoteException {
//        System.out.println("EditAccount");
//        int id = 0;
//        String Email = "Vlad@bue.edu.eg";
//        String Username = "Vlad@bue.edu.eg";
//        String Newusername = "Vladdd@bue.edu.eg";
//        String newpassword = "68798089";
//        String Password = "687980";
//        String type = "Professor";
//        instance = new User(db);
//        boolean expResult = true;
//        boolean result = instance.EditAccount(id, Email, Username, Newusername, newpassword, Password, type);
//        assertEquals(expResult, result);
    }

    // Test case 2: Inputing a not exsisting account
    @Test
    public void testEditAccountFail() throws Exception {
//        System.out.println("EditAccount");
//        int id = 2;
//        String Email = "omar";
//        String Username = "mohammed";
//        String Newusername = "7amada19";
//        String newpassword = "1234567";
//        String confirmNewPassword = "1234567";
//        String type = "Student";
//        boolean expResult = true;
//        boolean result = instance.EditAccount(id, Email, Username, Newusername, newpassword, confirmNewPassword, type);
//        assertNotEquals(expResult, result);

    }

    public class AccountInterfaceImpl implements AccountInterface {

//        public boolean AddnewAccount(String username, String password, String Email, String type) throws RemoteException {
//            return false;
//        }
//
//        public int Login(String user, String pass, String type) throws RemoteException {
//            return 0;
//        }
//
//        public boolean EditAccount(int id, String Email, String Username, String Newusername, String newpassword, String Password, String type) throws RemoteException {
//            return false;
//        }
//    }

}
