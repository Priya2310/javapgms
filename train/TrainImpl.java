/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Student
 */
public class TrainImpl implements TrainInterface 
{

    @Override
    public void insert(Train t) throws ClassNotFoundException, SQLException
    {
    Connection con = TestConn.getConnection();
    String q="insert into trainticket(tname,source,destination,fare) values(?,?,?,?)";
    PreparedStatement p = con.prepareStatement(q);
    p.setString(1, "rockfort");
    p.setString(2,"chennai");
    p.setString(3, "trichy");
    p.setFloat(4, 280.00f);
    int a = p.executeUpdate();
    System.out.println(a);
    }

    @Override
    public List displayAll(Train t) throws ClassNotFoundException, SQLException {
       Connection con = TestConn.getConnection();
       String q="select * from trainticket";
       PreparedStatement p = con.prepareStatement(q);
       ResultSet rs = p.executeQuery();
       while(rs.next())
       {
           System.out.println("train id : " + rs.getInt("tno") + " Train name : " + rs.getString("tname")+" Source : "+rs.getString("source")+" Destination : " + rs.getString("destination")+" Fare : "+rs.getFloat("fare"));
       }
        rs.close();
        con.close();
        return null;
    }
    
}
