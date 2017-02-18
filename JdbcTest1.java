import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTest1 
{
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	Class.forName("org.h2.Driver");
	String url = "jdbc:h2:tcp://localhost/~/My Server";
	Connection con = DriverManager.getConnection(url, "sa", "");
	System.out.println(con);
	String q = "insert into employee(ename,designation,phno) values('tara','ass.manager',944283712)";
	PreparedStatement p = con.prepareStatement(q);
	int a = p.executeUpdate();
	System.out.println("No of rows inserted : "+ a);
}
}
