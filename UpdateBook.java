/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class UpdateBook 
{
public void update(Connection con) throws SQLException
{
  String q = "update library set price=? where bid=?";
  PreparedStatement p = con.prepareStatement(q);
  p.setFloat(1, 245.75f);
  p.setInt(2,4);
  int a = p.executeUpdate();
  System.out.println("No of rows updates : " + a);
}
}
