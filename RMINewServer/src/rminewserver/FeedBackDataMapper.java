/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rminewserver;

import com.mongodb.client.model.Updates;
import java.rmi.RemoteException;
import java.util.ArrayList;
import org.bson.conversions.Bson;

/**
 *
 * @author Mostafa
 */
public class FeedBackDataMapper {
    
private final Database d;

    public FeedBackDataMapper(Database db) {
        this.d=db;
    }

    public boolean insertFeedback(int CustomerId, String date, int Rate, String complaint) throws RemoteException {
        boolean n;
        d.GetCollection("Customer");
        if (d.CheckInDatabase("ID", CustomerId)) {
            FeedbackDetails FeedBack = new FeedbackDetails(CustomerId, date, Rate, complaint);
            d.GetCollection("FeedBack");
            d.InsertIntoDatabase(FeedBack);
            n = true;
        } else {
            System.out.println("Service doesnot exist");
            n = false;
        }
        return n;
    }

    public boolean deleteFeedBack(String type, int id) {
        d.GetCollection("FeedBack");
        boolean n;
        if (d.CheckInDatabase("StudentId", id) ) {
            d.DeleteFromDatabase(type, id);
            n = true;
        } else {
            if (!(d.CheckInDatabase("StudentId", id))) {
                System.out.println("Student doesnot exist");
                n = false;
            } else if (!(d.CheckInDatabase("CourseId", id))) {
                System.out.println("Course doesnot exist");
                n = false;
            } else {
                System.out.println("Student and course doesnot exist");
                n = false;
            }
        }
        return n;
    }

    public boolean updateFeedBack( int CustomerId, String date, int Rate,  String Comments) {
        boolean n;
        d.GetCollection("Customer");
        if (d.CheckInDatabase("ID", CustomerId)) {
            d.GetCollection("FeedBack");
            Bson updates = Updates.combine(
                    Updates.set("CustomerId", CustomerId),
                    Updates.set("date", date),
                    Updates.set("Rate", Rate),
                    Updates.set("Comments", Comments)
            );
            d.UpdateFromDatabase("CustomerId", CustomerId, updates);
            n = true;
        } else {
            System.out.println("Feedback doesnot exist");
            n = false;
        }
        return n;
    }

    public String getFeedBack(String type, int id) {
        d.GetCollection("FeedBack");
        boolean n = d.CheckInDatabase("CustomerId", id);
        String oo = "FeedBack doesnot exists";
        return n ? d.GetFromDatabase(type, id) : oo;
    }

    public ArrayList<String> viewAll(int Sid) {
        d.GetCollection("FeedBack");
        return d.returnAll("CustomerId", Sid);
    }
}

