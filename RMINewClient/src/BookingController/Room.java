/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookingController;

import java.io.Serializable;

/**
 *
 * @author reemf011
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





public class Room implements Serializable{
    String roomId;
    int roomType;
    int roomPrice;
    String roomDetails;
    int roomQuantity;
    int roomAvailable;
   

    public Room(String roomId, int roomType, int roomPrice, String roomDetails,int roomQuantity,int roomAvailable) {
        roomId = this.roomId;
    	roomType = this.roomType;
        roomPrice = this.roomPrice;
        roomDetails = this.roomDetails;
        roomQuantity = this.roomQuantity;
        roomAvailable= this.roomAvailable;
    }



    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(String roomDetails) {
        this.roomDetails = roomDetails;
    }

    public int getRoomQuantity() {
        return roomQuantity;
    }

    public void setRoomQuantity(int roomQuantity) {
        this.roomQuantity = roomQuantity;
    }

    public int getRoomAvailable() {
        return roomAvailable;
    }

    public void setRoomAvailable(int roomAvailable) {
        this.roomAvailable = roomAvailable;
    }

}



