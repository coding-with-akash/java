package kites;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.Scanner;

public class Select3 {
	public static void main(String[] args) {
		String userName="root";
		String pass="";
		String url="jdbc:mysql://localhost:3307/travel";
		try {
			Connection con;
			con=DriverManager.getConnection(url,userName,pass);
			System.out.println("connected sucessfully...");
			
			
//			PreparedStatement pst=con.prepareStatement("select * from student order by rollno desc");
			PreparedStatement pst=con.prepareStatement("select * from student where rollno Between 10 AND 20 ");
			ResultSet n=pst.executeQuery();
			System.out.println(n+"fetch sucessfully...");
			while (n.next()) {
				System.out.println(n.getInt(1)+"\t"+n.getString(2)+"\t"+n.getFloat(3));
			}
			con.close();
			
		}catch (Exception e){
			System.out.println(e);
			
		}
		
	}
	}
