/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import rmi.FeedBackInterface;

public class FeedbackDetails extends UnicastRemoteObject  implements FeedBackInterface {
    
   
    private int CustomerId;
    private String date;
    private int Rate;
    private String complaint;
     FeedBackDataMapper FeedBackDataMapper;

  public FeedbackDetails(Database db) throws RemoteException{
       FeedBackDataMapper = new FeedBackDataMapper(db);
    }

    public FeedbackDetails(int CustomerId, String date, int Rate, String complaint) {
        this.CustomerId = CustomerId;
        this.date = date;
        this.Rate = Rate;
        this.complaint = complaint;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int Rate) {
        this.Rate = Rate;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public FeedBackDataMapper getFeedBackDataMapper() {
        return FeedBackDataMapper;
    }

    public void setFeedBackDataMapper(FeedBackDataMapper FeedBackDataMapper) {
        this.FeedBackDataMapper = FeedBackDataMapper;
    }
  
  
      

    @Override
    public boolean AddNewFeedBack( int CustomerId, String date, int Rate, String complaint) throws RemoteException{
        
        return FeedBackDataMapper.insertFeedback(CustomerId, date, Rate, complaint);
    }


    @Override
    public boolean deleteFeedBack(String type, int id) throws RemoteException{
        return FeedBackDataMapper.deleteFeedBack(type, id);
    }

    @Override
    public boolean UpdateFeedBack(int CustomerId, String date, int Rate, String complaint) throws RemoteException{
        return FeedBackDataMapper.updateFeedBack(  CustomerId, date, Rate, complaint);
    }


    @Override
    public ArrayList<String> ViewAll(int Sid) throws RemoteException{
        return FeedBackDataMapper.viewAll(Sid);
    }

    @Override
    public String toString() {
        return "FeedBack{" + "CustomerId=" + CustomerId + ", date=" + date + ", Rate=" + Rate + ", complaint=" + complaint + '}';
    }

}
