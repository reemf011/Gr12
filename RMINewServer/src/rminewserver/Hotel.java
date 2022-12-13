/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

/**
 *
 * @author DeS
 */
public class Hotel {
    int Hotel_Id;
    String Hotel_Name;
    String Hotel_Description;
    String Hotel_Address;
    double Hotel_Price;
    int Room_Count;
    int Suite_Count;

    public Hotel(int Hotel_Id, String Hotel_Name, String Hotel_Description, String Hotel_Address, double Hotel_Price, int Room_Count, int Suite_Count) {
        this.Hotel_Id = Hotel_Id;
        this.Hotel_Name = Hotel_Name;
        this.Hotel_Description = Hotel_Description;
        this.Hotel_Address = Hotel_Address;
        this.Hotel_Price = Hotel_Price;
        this.Room_Count = Room_Count;
        this.Suite_Count = Suite_Count;
    }

    public int getHotel_Id() {
        return Hotel_Id;
    }

    public void setHotel_Id(int Hotel_Id) {
        this.Hotel_Id = Hotel_Id;
    }

    public String getHotel_Name() {
        return Hotel_Name;
    }

    public void setHotel_Name(String Hotel_Name) {
        this.Hotel_Name = Hotel_Name;
    }

    public String getHotel_Description() {
        return Hotel_Description;
    }

    public void setHotel_Description(String Hotel_Description) {
        this.Hotel_Description = Hotel_Description;
    }

    public String getHotel_Address() {
        return Hotel_Address;
    }

    public void setHotel_Address(String Hotel_Address) {
        this.Hotel_Address = Hotel_Address;
    }

    public double getHotel_Price() {
        return Hotel_Price;
    }

    public void setHotel_Price(double Hotel_Price) {
        this.Hotel_Price = Hotel_Price;
    }

    public int getRoom_Count() {
        return Room_Count;
    }

    public void setRoom_Count(int Room_Count) {
        this.Room_Count = Room_Count;
    }

    public int getSuite_Count() {
        return Suite_Count;
    }

    public void setSuite_Count(int Suite_Count) {
        this.Suite_Count = Suite_Count;
    }
    public void SearchHotel(){}
    public void BookHotel(){}
    public void GiveFeedback(){}
    public void RateHotel(){}
            
           
}
