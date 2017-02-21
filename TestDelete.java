/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class TestDelete 
{
public void delete(Connection con) throws SQLException
{
    String q="delete from employee where eid=8";
    PreparedStatement p = con.prepareStatement(q);
    int a=p.executeUpdate();
    System.out.println("no. of rows deleted" + a);
}
}
