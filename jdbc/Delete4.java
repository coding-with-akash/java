package kites;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete4 {
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
//			int rollno=sc.nextInt();
			sc.close();
			PreparedStatement pst=con.prepareStatement("delete from student where sname=?");
			pst.setString(1, name);
//			pst.setInt(2, rollno);
			pst.executeUpdate();
			System.out.println("delete sucessfully...");
			con.close();
		}catch (Exception e){
			System.out.println(e);
			
		}
		
	}
	}
