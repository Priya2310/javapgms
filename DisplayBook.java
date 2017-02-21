/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class DisplayBook 
{
    public void display(Connection con) throws SQLException
    {
        String q="select bid,bname from library where price>?";
        PreparedStatement p = con.prepareStatement(q);
        p.setFloat(1, 300.00f);
        ResultSet rs = p.executeQuery();
        while(rs.next())
        {
            System.out.println("Book ID: " + rs.getInt("bid") + "Book Name: " +rs.getString("bname"));
        }
    }
}
