/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class InsertItem 
{
public void insert(Connection con) throws SQLException
{
   String q = "insert into hotel(iname,timing,price) values(?,?,?),(?,?,?),(?,?,?)";
   PreparedStatement p = con.prepareStatement(q);
   p.setString(1, "meals");
   p.setString(2, "lunch");
   p.setFloat(3,60.00f);
   p.setString(4, "bonda");
   p.setString(5, "Snacks");
   p.setFloat(6, 15.00f);
   p.setString(7, "chapathi");
   p.setString(8, "dinner");
   p.setFloat(9, 45.00f);
   int a = p.executeUpdate();
   System.out.println("No. of rows inserted " + a);
}
}
