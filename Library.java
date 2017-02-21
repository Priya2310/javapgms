/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class Library 
{
  public static void main(String args[]) throws ClassNotFoundException, SQLException
  {
      Connection con = TestConn.getConnection();
      /*InsertBook ib = new InsertBook();
      ib.insert(con);
      DeleteBook db = new DeleteBook();
      db.delete(con);
      UpdateBook ub = new UpdateBook();
      ub.update(con);*/
      DisplayBook d= new DisplayBook();
      d.display(con);
  }
}
