package kites;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class DynamicInsert1 {
	
	public static void main(String args[]) {
		String userName="root";
		String pass="";
		String url="jdbc:mysql://localhost:3307/travel";
		
		
		try {
			Connection con;
			con=DriverManager.getConnection(url,userName,pass);
			
			/*
			 * Statement st=con.createStatement(); //statement created st.
			 * executeUpdate("create table student(rollno integer primary key, sname varchar(50), per float)"
			 * ); System.out.println("Table created successfully......");
			 */
			  
			  Scanner sc=new Scanner(System.in);
			  int rollno=sc.nextInt();
			  String name=sc.next();
			  float per=sc.nextFloat();
			  sc.close();
			  
			  PreparedStatement pst=con.prepareStatement("Insert into student values(?,?,?)");
			  pst.setInt(1, rollno);
			  pst.setString(2, name);
			  pst.setFloat(3, per);
			  
			  int n=pst.executeUpdate();
			  System.out.println(n+" inserted succesfully");
			  con.close();
		} catch (SQLException e) {
			 System.out.println(e);
			
		}
         System.out.println("database connected");
	}

}
