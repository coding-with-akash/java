package kites;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStmt5 {

	static Scanner sc;
	static Connection cn;
	static CallableStatement cst;
	

	public static String getName() {
		
		
		String name="";
		String userName="root";
		String pass="";
		String url="jdbc:mysql://localhost:3307/travel";
		try {
			Connection con;
			con=DriverManager.getConnection(url,userName,pass);
			System.out.println("connected sucessfully...");
			
			sc=new Scanner(System.in);
			System.out.println("Enter the rollno  "); 
			int rollno=sc.nextInt();
			cst=cn.prepareCall("{? =  call getStudentName(?)}");
			cst.setInt(2, rollno);
			cst.registerOutParameter(1, java.sql.Types.VARCHAR);
			cst.execute();
			name=cst.getString(1);
			System.out.println(name);
			cn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return name;
	
	}
}
