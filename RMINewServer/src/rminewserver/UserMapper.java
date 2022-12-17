/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import com.mongodb.client.model.Updates;
import java.rmi.RemoteException;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author reemf011
 */
public class UserMapper {



    Database db;

    public UserMapper(Database db) {
        this.db = db;
    }


    public boolean SignUp(String username, String password, String Email) throws RemoteException {

        int count;
        boolean n = false;

        if (!db.CheckInDatabase("Username", username)) {
        
                    db.GetCollection("Customer");
                    ArrayList<Object> l = db.returnAll();
                    count = l.size() + 1;
                    Customer c = new Customer(count, username,password, Email);
                    db.InsertIntoDatabase(c);
                    db.GetCollection("Account");
                    User acc = new User(count, username, password, Email);
                    db.InsertIntoDatabase(acc);
                    n = true;
        }
                
           else {
            n = false;
            System.out.println("Username already exists");
        }
        return n;
    }

   /* public int loginVerify(String Username, String Password) {
      /*  db.GetCollection("Account");
        int a;
        String s = "";
        //if (db.CheckInDatabase("Username", Username, "Password", Password)) {
           
                Document doc = db.GetFromDatabase("Username", Username);
                int idd = (int) doc.get("id");
                return idd;
         
          }
        else {
            System.out.println("Not Verified");
         

    }   return 0;
        }*/
   
    public boolean editAccount(int id, String Email, String username, String Newusername, String newPassword, String Password) {
        db.GetCollection("Account");
        boolean n = false;
        if (db.CheckInDatabase("Email", Email, "Password", Password)) {
 

                    Bson Aupdates = Updates.combine(
                            Updates.set("Username", Newusername),
                            Updates.set("Password", newPassword)
                    );
                    db.UpdateFromDatabase("id", id, Aupdates);
                    n = true;

                
}
      
        return false;

}

    int loginVerify(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


