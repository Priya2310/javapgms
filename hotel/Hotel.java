/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class Hotel implements HotelInterface
{

    @Override
    public void insert(Connection con) throws SQLException
    {
    String q = "insert into hotel(iname,timing,price) values(?,?,?),(?,?,?),(?,?,?)";
    PreparedStatement p = con.prepareStatement(q);
    p.setString(1, "dosa");
    p.setString(2, "breakfast");
    p.setFloat(3,50.00f);
    p.setString(4, "biriyani");
    p.setString(5, "lunch");
    p.setFloat(6, 70.00f);
    p.setString(7, "Naan");
    p.setString(8, "dinner");
    p.setFloat(9, 40.00f);
    int a = p.executeUpdate();
    System.out.println("No. of rows inserted " + a);   
    }

    @Override
    public void delete(Connection con) throws SQLException
    {
    String q = "delete from hotel where itemid=?";
    PreparedStatement p = con.prepareStatement(q);
    p.setInt(1, 5);
    int a = p.executeUpdate();
    System.out.println("No of rows deleted : " + a);
    }

    @Override
    public void update(Connection con) throws SQLException
    {
     String q= "update hotel set price=? where itemid=?";
     PreparedStatement p = con.prepareStatement(q);
     p.setFloat(1, 70.00f);
     p.setInt(2, 2);
     int a = p.executeUpdate();
     System.out.println("No.of rows updated : " + a);
    }

    @Override
    public void display(Connection con) throws SQLException
    {
        String q = "select iname,price from hotel where timing=?";
        PreparedStatement p = con.prepareStatement(q);
        p.setString(1, "lunch");
        ResultSet rs = p.executeQuery();
        while(rs.next())
        {
            System.out.println("Item name : " + rs.getString("iname") + " Price : " + rs.getFloat("price"));
        }
    }
    
}
