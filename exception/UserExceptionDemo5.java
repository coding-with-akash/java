package exception;
import java.util.Scanner;
public class UserExceptionDemo5 {
   public static void main(String args[]) throws UserException4{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Employee age : ");
	   int age=sc.nextInt();
	   
	   if(age<18) {
//		   try {
		   throw new UserException4("error ---age shoule be greater than 18");
//		   }
//		   System.out.println("no need to handel here");//unreachable
//		   catch(UserException4 e) {
//			   System.out.println("Error occured: "+e.getMessage());
//		   }
	   }
	   else {
		   System.out.println("Entered Employee accepted... : ");
	   }
		   
	   
   }
}
