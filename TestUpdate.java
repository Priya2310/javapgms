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
public class TestUpdate 
{
public void update(Connection con) throws SQLException
{
    String q = "update employee set designation='engineer' where eid = 4";
    PreparedStatement p = con.prepareStatement(q);
    int a = p.executeUpdate();
    System.out.println("no.of rows updates" + a);
}
}
