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
public class DeleteBook 
{
public void delete(Connection con) throws SQLException
{
String q = "delete from library where bid=?";
PreparedStatement p=con.prepareStatement(q);
p.setInt(1, 3);
int a = p.executeUpdate();
System.out.println("No. of rows deleted : " + a);
}
}
