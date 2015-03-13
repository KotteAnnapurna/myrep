

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Queries {
//private static String insert="insert into project (area,comments) values (?,?)";
	private static String select="select caseno from project2 where area=?";
//private static String update="update project set image=? where caseno=?";
//public  static int insert(String area,String comments, Connection conn)
//{
//	int n=0;
//	try{
//	PreparedStatement pst=conn.prepareStatement(insert);
//	pst.setString(1, area);
//	pst.setString(2, comments);
//	 n=pst.executeUpdate();
//	
//}
//catch(Exception e)
//{
//	e.printStackTrace();
//}
//	return n;
//}
public static int showCaseno(String area,Connection conn){
	ResultSet rs=null;
	int caseno=0;
	try{
		PreparedStatement pst=conn.prepareStatement(select);
		pst.setString(1, area);
		 rs=pst.executeQuery();
		if(rs.next()){
			rs.last();
			caseno=rs.getInt(1);
		}
		else{
			System.out.println("select query not working");
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return caseno;
	}
//public static int Updateimage(Connection conn, Myclass bean){
//	int caseno=bean.getCaseno();
//	int n=0;
//	try{
//	PreparedStatement pst=conn.prepareStatement(update);
//	pst.setInt(1, caseno);
//	n=pst.executeUpdate();
//	}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//	}
//	return n;
//}
}
