/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class TestDisplay 
{
public void display(Connection con) throws SQLException
{
    String q ="select ename from employee where designation='engineer'";
    PreparedStatement p = con.prepareStatement(q);
    ResultSet r = p.executeQuery();
    while(r.next())
    {
        System.out.println("ename " + r.getString("ename"));
    }
}
}
