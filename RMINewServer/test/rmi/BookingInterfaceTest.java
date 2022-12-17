/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import rminewserver.Booking;
import rminewserver.BookingDTO;
import rminewserver.BookingFacadeInterface;
>>>>>>> 0a3793c49f2cb4ac3d2a2f1dfe5b78ad20a0c3a4
import rminewserver.Database;

/**
 *
 * @author notebook
 */
public class BookingInterfaceTest {
    
    Database db;
    BookingFacadeInterface instance;
    public BookingInterfaceTest() throws RemoteException {
        db = new Database();
        db.GetCollection("Booking");
        instance = new Booking(db);
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

    // testing to add a new booking
    
    @Test
    public void testAddBooking() throws Exception {
        System.out.println("Add Booking");
        int booking_Id = 1;
        String Booking_Type = "Hotel";
        String booking_date = "14/1/2023";
        String booking_Status = "Confirmed";
        String booking_time = "11:00 AM";
         boolean expResult = true;
        boolean result = instance.AddnewBooking(booking_Id, Booking_Type, booking_date, booking_Status, booking_time);
        assertEquals(expResult, result);
    }

    // testing to view the booking
    
    @Test
    public void testViewBooking() throws Exception {
        System.out.println("View Booking");
        int booking_Id = 12045;
        boolean expResult = true;
        String result = instance.ViewBooking(booking_Id);
        assertNotEquals(expResult, result);
    }


    public class BookingInterfaceImpl implements BookingFacadeInterface {

        @Override
        public void SetBookingData(int booking_ID, String booking_date, String booking_status) throws RemoteException {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String getBookingData() throws RemoteException {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public BookingDTO getBooking() throws RemoteException {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public boolean AddnewBooking(int i, String string, String string1, String string2, String string3) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public String ViewBooking(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        
    }
}
