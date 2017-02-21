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
public class TestInsert 
{
    public void insert(Connection con) throws SQLException
    {
        String q = "insert into employee(ename,address,designation,salary,phno) values('raj','chennai','team lead',20000,98772449),('naina','mumbai','manager',35000,97993482)";
	PreparedStatement p = con.prepareStatement(q);
	int a = p.executeUpdate();
	System.out.println("No of rows inserted : "+ a);
    }
        
}
