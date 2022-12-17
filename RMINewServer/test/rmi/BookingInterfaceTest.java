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
        db.GetCollection("Bookings");
        instance = new Bookings(db);
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
     * Test of add booking method
     */
    
    @Test
    public void testAddBooking() throws Exception {
//        System.out.println("AddBooking");
//        int TranscriptID = 892191;
//        int StudentID = 12;
//        int CourseID = 5;
//        char StudentGrade = 'A';
//        String TransicriptDate = "1/1/1";
//        String UpdatedDate = "2/2/2";
//        boolean IsRequested = false;
//        boolean expResult = true;
//        boolean result = instance.AddTranscript(TranscriptID, StudentID, CourseID, StudentGrade, TransicriptDate, UpdatedDate, IsRequested);
//        assertEquals(expResult, result);
    }

    /**
     * Test of view booking method
     */
    @Test
    public void testViewTranscript() throws Exception {
//        System.out.println("ViewTranscript");
//        int Sid = 15;
//        int Cid = 9202;
//        String expResult = "";
//        String result = instance.ViewTranscript(Sid, Cid);
//        assertNotEquals(expResult, result);
    }


    public class BookingInterfaceImpl implements BookingFacadeInterface {

//        public boolean AddBooking(int TranscriptID, int StudentID, int CourseID, char StudentGrade, String TransicriptDate, String UpdatedDate, boolean IsRequested) throws RemoteException {
//            return false;
//        }
//
//        public boolean EditBooking(int TranscriptID, int StudentID, int CourseID, char StudentGrade, String TransicriptDate, String UpdatedDate, boolean IsRequested) throws RemoteException {
//            return false;
//        }
//
//        public boolean deleteBooking(String type, int id, String type2, int id2) throws RemoteException {
//            return false;
//        }
//
//        public String ViewBooking(int Sid, int Cid) throws RemoteException {
//            return "";
//        }
//
//        public ArrayList<String> ViewAll(int Sid) throws RemoteException {
//            return null;
//        }
//    }
}
}
