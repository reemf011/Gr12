/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

import java.rmi.RemoteException;
import java.util.ArrayList;
import rminewserver.Database;

/**
 *
 * @author note book
 */
public class loginTest {
    Database db;
    TranscriptInterface instance;
    public TranscriptInterfaceTest() throws RemoteException {
        db = new Database();
        db.GetCollection("Transcript");
        instance = new Transcript(db);
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
     * Test of AddTranscript method, of class TranscriptInterface.
     */
    @Test
    public void testAddTranscript() throws Exception {
        System.out.println("AddTranscript");
        int TranscriptID = 892191;
        int StudentID = 12;
        int CourseID = 5;
        char StudentGrade = 'A';
        String TransicriptDate = "1/1/1";
        String UpdatedDate = "2/2/2";
        boolean IsRequested = false;
        boolean expResult = true;
        boolean result = instance.AddTranscript(TranscriptID, StudentID, CourseID, StudentGrade, TransicriptDate, UpdatedDate, IsRequested);
        assertEquals(expResult, result);
    }

    /**
     * Test of ViewTranscript method, of class TranscriptInterface.
     */
    @Test
    public void testViewTranscript() throws Exception {
        System.out.println("ViewTranscript");
        int Sid = 15;
        int Cid = 9202;
        String expResult = "";
        String result = instance.ViewTranscript(Sid, Cid);
        assertNotEquals(expResult, result);
    }


    public class TranscriptInterfaceImpl implements TranscriptInterface {

        public boolean AddTranscript(int TranscriptID, int StudentID, int CourseID, char StudentGrade, String TransicriptDate, String UpdatedDate, boolean IsRequested) throws RemoteException {
            return false;
        }

        public boolean EditTranscript(int TranscriptID, int StudentID, int CourseID, char StudentGrade, String TransicriptDate, String UpdatedDate, boolean IsRequested) throws RemoteException {
            return false;
        }

        public boolean deleteTranscript(String type, int id, String type2, int id2) throws RemoteException {
            return false;
        }

        public boolean RequestCertificate(int type, int paymentID, int studentID, String date, int courseID, double amount) throws RemoteException {
            return false;
        }

        public String ViewTranscript(int Sid, int Cid) throws RemoteException {
            return "";
        }

        public ArrayList<String> ViewAll(int Sid) throws RemoteException {
            return null;
        }
    }
    
}

