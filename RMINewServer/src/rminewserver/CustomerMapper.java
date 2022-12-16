/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;


import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author reemf011
 */
public class CustomerMapper {



    Database db;
    public CustomerMapper(Database db) {
        this.db=db;
    }

    public void InsertCustomer(Customer ct) {
        db.GetCollection("Customer");
        if (db.CheckInDatabase("ID", ct.getUserID())) {
            System.out.println("Customer Already Exists!");
        } else {
            db.InsertIntoDatabase(ct);
            System.out.println("Customer Added");
        }
        
    }

    public void deleteStudent(int UserID) {
        db.GetCollection("Customer");
        if (!db.CheckInDatabase("ID", UserID)) {
            System.out.println("Customer Doesn't Exist!");
        } else {
            db.DeleteFromDatabase("ID", UserID);
            db.GetCollection("Customer");
            while (db.CheckInDatabase("CustomerID", UserID)) {
                db.DeleteFromDatabase("CustomerID", UserID);
            }
            System.out.println("Customer Removed");
        }
        
    }

    public void UpdateStudent(Customer ct) {
        db.GetCollection("Customer");
        if (!db.CheckInDatabase("ID", ct.getUserID())) {
            System.out.println("Customer Doesn Exist!");
        } else {

            Bson updates = Updates.combine(
                    Updates.set("ID", ct.getUserID()),
                    Updates.set("Name", ct.getUserName()),
                    Updates.set("Email", ct.getEmail())
            );

            db.UpdateFromDatabase("ID", ct.getUserID(), updates);

            System.out.println("Customer Updated");
        }
        
    }




    public ArrayList<String> ViewBookings(int id) {
        ArrayList<String> result = new ArrayList();
        db.GetCollection("Bookings");

        if (!db.CheckInDatabase("CustomerID", id)) {
            System.out.println("Cutsomer have not booked anything yet!");
        } else {
            ArrayList<String> z = db.returnAll("CustomerID", id);
            db.GetCollection("Reservation");
            for (int i = 0; i < z.size(); i++) {
                String x = z.get(i);
                Document d = Document.parse(x);
                double cid = (double) d.get("ReservationID");
                int cidd = (int) cid;
                result.add(db.GetFromDatabase("ID", cidd, "Observers"));
            }
        }
        return result;
    }
}
    

