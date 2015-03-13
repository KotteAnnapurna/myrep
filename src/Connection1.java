

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1 {
private static String driver="com.mysql.jdbc.Driver";
private static String user="root";
private static String password="root";
private static String url="jdbc:mysql://127.0.0.1:3306/mydatabase";
public static Connection getConnection()
{   Connection conn=null;
	try{

	Class.forName(driver);
	 conn=DriverManager.getConnection(url, user, password);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return conn;
}
}
