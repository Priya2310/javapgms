/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public interface HotelInterface 
{
public void insert(Connection con) throws SQLException;
public void delete(Connection con) throws SQLException;
public void update(Connection con) throws SQLException;
public void display(Connection con) throws SQLException;
}
