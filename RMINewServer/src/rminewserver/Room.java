/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

/**
 *
 * @author DeS
 */
public class Room {
    int Room_number;
    String CheckIn;
    String CheckOut;

    public int getRoom_number() {
        return Room_number;
    }

    public void setRoom_number(int Room_number) {
        this.Room_number = Room_number;
    }

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String CheckIn) {
        this.CheckIn = CheckIn;
    }

    public String getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(String CheckOut) {
        this.CheckOut = CheckOut;
    }
      public void AddRoom(){}
    public void EditRoom(){}
    public void CancelRoom(){}
    public void RateRoom(){}
}
