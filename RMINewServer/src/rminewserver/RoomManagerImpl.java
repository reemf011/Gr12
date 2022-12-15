/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rminewserver.Room;
import rmi.RoomManager;

public class RoomManagerImpl extends UnicastRemoteObject implements RoomManager{
    

    protected RoomManagerImpl(String msg) throws RemoteException {
	super();
        //message = msg;=
    }
        
    public String book(String gid, String name, String rType) throws RemoteException {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try{
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotelroomreservation","root","");
                Statement S=con.createStatement();
                
                ResultSet rs = S.executeQuery("SELECT roomId, roomAvailable FROM room WHERE roomType='"+rType+"'");
            
                String rid = "";
                int available = 0;
                
                while (rs.next()){
                    rid = rs.getString("roomId");
                    available = rs.getInt("roomAvailable");
                }
                
                if (available > 0) {
                    available = available - 1;
                    S.execute("UPDATE room SET roomAvailable="+available+" WHERE roomType='"+rType+"'");
                    S.execute("INSERT INTO booking(guestid, name, roomid, roomtype) VALUES ('"+gid+"','"+name+"','"+rid+"','"+rType+"')");
                    JOptionPane.showMessageDialog(null,"Room booked.","Welcome Message",JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Room not available. Please choose another room.","",JOptionPane.INFORMATION_MESSAGE);
                }
                    con.close();
                    S.close();
                
                //new options().setVisible(true);
              
            } catch (SQLException ex) {
                Logger.getLogger(RoomManagerImpl.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RoomManagerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ("");
    }
    
    @Override
    public String[][] getListData(){
        String[][] data = null;
        String[] column = null;
        
        try{
                    Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotelroomreservation","root","");
			PreparedStatement ps=con.prepareStatement("select * from booking",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
			column=new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();

            data = new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
        return data;
    }

    @Override
    public String[] getListColumn() throws RemoteException {
        String[] column = null;
        String[][] data=null;
        try{
                    Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hotelroomreservation","root","");
			PreparedStatement ps=con.prepareStatement("select * from booking",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cols=rsmd.getColumnCount();
            column = new String[cols];
			for(int i=1;i<=cols;i++){
				column[i-1]=rsmd.getColumnName(i);
			}
			
			rs.last();
			int rows=rs.getRow();
			rs.beforeFirst();

            data = new String[rows][cols];
			int count=0;
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					data[count][i-1]=rs.getString(i);
				}
				count++;
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
        
        return column;
    }

    @Override
    public List<Room> displayRooms() throws Exception {
       List<Room> list = new ArrayList<Room>();
    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/hotelroomreservation","root","");
            String rm = "SELECT * FROM room";
            Statement statement =con1.createStatement();
            ResultSet rset=statement.executeQuery(rm);
            
            //Extract data from result set
            while(rset.next())
            {
                //Retrieve by column name
                String roomId=rset.getString("roomID");
                int roomType=rset.getInt("roomType");
                int roomPrice=rset.getInt("roomPrice");
                String roomDetails=rset.getString("roomDetails");
                int roomQuantity=rset.getInt("roomQuantity");
                int roomAvailable=rset.getInt("roomAvailable");
                
                //Setting the values
                Room room=new Room(roomId,roomType,roomPrice,roomDetails,roomQuantity,roomAvailable);
                room.setRoomId(roomId); 
                room.setRoomType(roomType);
                room.setRoomPrice(roomPrice);
                room.setRoomDetails(roomDetails);
                room.setRoomQuantity(roomQuantity);
                room.setRoomAvailable(roomAvailable);
                
                list.add(room);
              
            }
            
            return list; 
    }
    


}
