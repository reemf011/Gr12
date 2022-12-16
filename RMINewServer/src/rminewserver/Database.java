/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rminewserver;

import com.google.gson.Gson;
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Projections.exclude;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;
import rmi.DatabseInterface;


/**
 *

 */
public class Database extends UnicastRemoteObject implements DatabseInterface,Serializable{

    private static Database db=null;
    private MongoClient mc;
    private MongoDatabase md;
    private MongoCollection mongoCollection;
    Gson gson = new Gson();

     public static Database getDb() {
        return db;
    }
    
    public static boolean CheckDB() {
        return db!=null;
    }
    
    public Database(int x) throws RemoteException{
    }
    
    public Database() throws RemoteException 
    {
        try{
            mc = new MongoClient("localhost", 27017);
            md = mc.getDatabase("ReservationSytem");
            db= new Database(mc,md,mongoCollection);
        }catch(Exception e){
            System.out.println("Connection Error: " + e.getMessage());
        }
        
    }
    public Database(MongoClient mc,MongoDatabase md, MongoCollection mongoCollection)throws RemoteException {
        this.mc=mc;
        this.md = md;
        this.mongoCollection = mongoCollection;
    }
    
    public void GetCollection(String CollectionName) 
    {
        mongoCollection = md.getCollection(CollectionName);
        if(mongoCollection == null){
            md.createCollection(CollectionName);
            mongoCollection = md.getCollection(CollectionName);
        }        
    }
    
      public MongoCollection getCollection(String CollectionName) {
        mongoCollection = md.getCollection(CollectionName);
        if (mongoCollection == null) {
            md.createCollection(CollectionName);
            mongoCollection = md.getCollection(CollectionName);
        }

        return mongoCollection;
    }

    public void InsertIntoDatabase(Object o){
        String r = gson.toJson(o);
        mongoCollection.insertOne(Document.parse(r));
    }
    
    public void DeleteFromDatabase(String type,int id){
        mongoCollection.deleteOne(Document.parse(GetFromDatabase(type,id)));
    }
    
    public void DeleteFromDatabase(String type1,int id1,String type2,int id2){
        mongoCollection.deleteOne(Document.parse(GetFromDatabase(type1,id1,type2,id2)));
    }

    public void UpdateFromDatabase(String type, int id , Bson updates){
        mongoCollection.updateOne(Filters.eq(type, id), updates);
    }
    
     public String GetFromDatabase(String type, int id){
        if(CheckInDatabase(type,id)){
            Document x = (Document)mongoCollection.find(Filters.eq(type, id)).first();
            return x.toJson();
        }else{
            return null;
        }
    }
    

    
    public String GetFromDatabase(String type1, int id1,String type2,int id2){
        if(CheckInDatabase(type1,id1,type2,id2)){
            Bson globalFilter = Filters.eq(type1, id1);
            Bson instIdFilter = Filters.eq(type2, id2);
            Document x = (Document)mongoCollection.find(Filters.and(globalFilter,instIdFilter)).first();
            return x.toJson();
        }else{
            return null;
        }
    }
    
    public String GetFromDatabase(String type, int id, String type2){
        if(CheckInDatabase(type,id)){
            Document x = (Document)mongoCollection.find(Filters.eq(type, id)).projection(fields(exclude(type2))).first();
            return x.toJson();
        }else{
            return null;
        }
    }
    
    
    public boolean CheckInDatabase(String type, int id){
        return (Document)mongoCollection.find(Filters.eq(type, id)).first() != null;
    }
    
     public boolean CheckInDatabase(String type, boolean id){
        return (Document)mongoCollection.find(Filters.eq(type, id)).first() != null;
    }
    
    
    public boolean CheckInDatabase(String type, String id){
        return (Document)mongoCollection.find(Filters.eq(type, id)).first() != null;
    }
    
    public boolean CheckInDatabase(String type1, int id1,String type2,int id2){
        Bson globalFilter = Filters.eq(type1, id1);
        Bson instIdFilter = Filters.eq(type2, id2);
        return (Document)mongoCollection.find(Filters.and(globalFilter,instIdFilter)).first() != null;
    }
    
    public boolean CheckInDatabase(String type1, String id1,String type2,String id2,String type3,String id3){
        Bson globalFilter = Filters.eq(type1, id1);
        Bson instIdFilter = Filters.eq(type2, id2);
        Bson instId2Filter = Filters.eq(type3, id3);
        return (Document)mongoCollection.find(Filters.and(globalFilter,instIdFilter,instId2Filter)).first() != null;
    }
    
    public boolean CheckInDatabase(String type1, String id1,String type2,String id2){
        Bson globalFilter = Filters.eq(type1, id1);
        Bson instIdFilter = Filters.eq(type2, id2);
        return (Document)mongoCollection.find(Filters.and(globalFilter,instIdFilter)).first() != null;
        
    }
    
    
    
    public ArrayList<Object> returnAll(){
        ArrayList<Object> result = new ArrayList();
        ArrayList<Document> docs= (ArrayList<Document>) mongoCollection.find().into(new ArrayList<>());

        for(int i=0;i<docs.size();i++){
            String jsonR=docs.get(i).toJson();
            result.add(gson.fromJson(jsonR, Object.class));
        }
        return result;
    }
    
    public ArrayList<String> returnAll(String type,int id){
        ArrayList<String> result = new ArrayList();
        ArrayList<Document> docs= (ArrayList<Document>) mongoCollection.find(Filters.eq(type, id)).into(new ArrayList<>());

        for(int i=0;i<docs.size();i++){
            String jsonR=docs.get(i).toJson();
            result.add(jsonR);
        }
        return result;
    }
    
    
 
    @Override
    public void OpenDBConnection() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CloseDBConnection() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




    
}
    
  /* public DB() 
    {
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        mongoClient = new MongoClient();
        // Database name
        database = mongoClient.getDatabase("ReservationSytem"); 
        collection1 = database.getCollection("Customer"); 
        collection2 = database.getCollection("Car");
        collection3 = database.getCollection("Hotel");
        collection4 = database.getCollection("CustomerService");
        
      }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
         public void insertHotel(Hotel h) 
    {
        collection3.insertOne(Document.parse(gson.toJson(h)));
        System.out.println("Hotel is inserted successfully.");
    }
         
        // update hotel in the hotel collection
        public Hotel getHotelName(String Hotel_Name) {
        Document doc = collection3.find(Filters.eq("hotel name", Hotel_Name)).first();
        Hotel Result = gson.fromJson(doc.toJson(), Hotel.class);
        return Result;
    }
        
        
        public void updateHotel(Hotel h) {
        Document doc = Document.parse(gson.toJson(h));
        collection3.replaceOne(Filters.eq("Hotel's Name", h.getHotel_Name()), doc);
    }
        
        
        public void updateHotelName( String name,String newRoomCnt) {
       
        collection3.updateOne(Filters.eq("Hotel's name",name), Updates.set("Room_Count",newRoomCnt));
    }

       
       
       
       
         public void insertCustomer(Customer c) 
    {
        collection1.insertOne(Document.parse(gson.toJson(c)));
        System.out.println("Customer is inserted is inserted.");
    }
         
        // update customer in the customer collection
        public Customer getCustomegrEmail(String Email) {
        Document doc = collection2.find(Filters.eq("customer's email", Email)).first();
        Customer result = gson.fromJson(doc.toJson(), Customer.class);
        return result;
    }
        
        
        public void updateCustomer(Customer c) {
        Document doc = Document.parse(gson.toJson(c));
        collection2.replaceOne(Filters.eq("customer's email", c.getEmail()), doc);
    }
        
        
        public void updateCustomerEmail( String name,String newEmail) {
       
        collection2.updateOne(Filters.eq("customer's name",name), Updates.set("Email",newEmail));
    }
        
         
         
       
        public void deleteCustomer(Customer c1) {
        collection1.deleteOne( Document.parse(gson.toJson(c1)));
        System.out.println("Customer is deleted");
    }

        
       
         //insert car to car collection in the database 
        public void insertCar(Car c) 
    {
        collection2.insertOne(Document.parse(gson.toJson(c)));
        System.out.println("Car is inserted is inserted.");
    }
        // update car in the car collection
        public Car getCarLocation(String Location) {
        Document doc = collection2.find(Filters.eq("Car Location", Location)).first();
        Car result = gson.fromJson(doc.toJson(), Car.class);
        return result;
    }
        
        
        public void updateCar(Car c) {
        Document doc = Document.parse(gson.toJson(c));
        collection2.replaceOne(Filters.eq("Car Location", c.getLocation()), doc);
    }
        
        
        public void updateCarLocation( int BookID,String newLocation) {
       
        collection2.updateOne(Filters.eq("car booking ID",BookID), Updates.set("Location",newLocation));
    }
        
    
        // delete car from car collection in the database
        public void deleteCar(int BookID) {
        collection2.deleteOne(Filters.eq("car no.", BookID));
        System.out.println("Car is deleted");
    }        
              
         
         public void close() 
    {
        mongoClient.close();
    }
}
*/