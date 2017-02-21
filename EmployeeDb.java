/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class EmployeeDb 
{

    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        Class.forName("org.h2.Driver");
	String url = "jdbc:h2:tcp://localhost/~/test";
	Connection con = DriverManager.getConnection(url, "sa", "");
	System.out.println(con);
	//TestInsert ti = new TestInsert();
        //TestDelete td = new TestDelete();
        //TestUpdate tu = new TestUpdate();
        TestDisplay t=new TestDisplay();
        //ti.insert(con);
        //td.delete(con);
        //tu.update(con);
        t.display(con);
    }
    
}
