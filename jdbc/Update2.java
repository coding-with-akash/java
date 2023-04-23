package kites;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Update2 {
public static void main(String[] args) {
	String userName="root";
	String pass="";
	String url="jdbc:mysql://localhost:3307/travel";
	try {
		Connection con;
		con=DriverManager.getConnection(url,userName,pass);
		System.out.println("connected sucessfully...");
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int rollno=sc.nextInt();
		sc.close();
		PreparedStatement pst=con.prepareStatement("update student set sname=? where rollno=?");
		pst.setString(1, name);
		pst.setInt(2, rollno);
		pst.executeUpdate();
		System.out.println("update sucessfully...");
		con.close();
	}catch (Exception e){
		System.out.println(e);
		
	}
	
}
}
