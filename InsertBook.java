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
public class InsertBook 
{
public void insert(Connection con) throws SQLException
{
    String q="insert into library(bname,year,publication,price) values(?,?,?,?),(?,?,?,?),(?,?,?,?)";
    PreparedStatement p = con.prepareStatement(q);
    p.setString(1, "Eclipse");
    p.setInt(2, 2010);
    p.setString(3, "Universal");
    p.setFloat(4, 355.25f);
    p.setString(5, "The Hunger Games");
    p.setInt(6, 2013);
    p.setString(7, "Oxford");
    p.setFloat(8,283.15f);
    p.setString(9, "Two States");
    p.setInt(10,2015);
    p.setString(11, "Higginbothams");
    p.setFloat(12,175.25f);
    int a = p.executeUpdate();
    System.out.println("no.of rows inserted : " + a);
}
}
