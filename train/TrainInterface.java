/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Student
 */
public interface TrainInterface 
{
public void insert(Train t) throws ClassNotFoundException, SQLException;
public List displayAll(Train t) throws ClassNotFoundException, SQLException;
}
