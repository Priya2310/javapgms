/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.SQLException;
import library.TestConn;

/**
 *
 * @author Student
 */
public class TestHotel 
{
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
    Connection con = TestConn.getConnection();
    Hotel h = new Hotel();
    //h.insert(con);
    //h.delete(con);
    //h.update(con);
    h.display(con);
}
}
