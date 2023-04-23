package kites;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Connect0 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int sr=4;
		String name="popatlal";
//		int password=15425;
		String userName="root";
		String pass="";
		String url="jdbc:mysql://localhost:3307/travel";
//		Class.forName("com.mysql.jdbc.Driver");
		try {
//		@SuppressWarnings("unused")
		Connection con;
		con=DriverManager.getConnection(url,userName,pass);
         System.out.println("database connected");
         
        String s="INSERT INTO login VALUE("+sr+","+"'"+name+"'"+","+pass+")";
        PreparedStatement st=con.prepareStatement(s);
        System.out.println("database connected ankd data inserted correctly");
        st.execute();
        con.close();
		}catch(Exception e) {
			System.out.println("error occured"+e);
		}
	}

}
