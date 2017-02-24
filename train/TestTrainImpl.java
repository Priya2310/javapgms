/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class TestTrainImpl 
{
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
    TrainImpl ti = new TrainImpl();
    //ti.insert(null);
    ti.displayAll(null);
}
}
