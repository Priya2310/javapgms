package sourcecode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn 
{
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	Class.forName("org.h2.Driver");
	String url="jdbc:h2:tcp://localhost/~/test";
	Connection con=DriverManager.getConnection(url, "sa", "");
	System.out.println(con);
	}
}
