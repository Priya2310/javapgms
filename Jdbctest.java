import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbctest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	Class.forName("org.h2.Driver");
	String url = "jdbc:h2:tcp://localhost/~/My Server";
	Connection con = DriverManager.getConnection(url, "sa", "");
	System.out.println(con);
	insert(con);
	delete(con);
	}

	public static void delete(Connection con) throws SQLException {
		String q1 = "delete from stu where sid=7";
		PreparedStatement p1 = con.prepareStatement(q1);
		int b = p1.executeUpdate();
		System.out.println("No of rows deleted: "+b);
	}

	public static void insert(Connection con) throws SQLException {
		String q = "insert into stu values(5,'hema','bangalore',8),(6,'ani','mumbai',7),(7,'lavi','kochi',6)";
		PreparedStatement p = con.prepareStatement(q);
		int a = p.executeUpdate();
		System.out.println("No of rows inserted " + a);
	}

}
