package exception;
import java.util.Scanner;

public class MultipleCatch3 {
	public static void main(String[] args) {
		Scanner sc;
		int n1,n2;
		
		try {
			sc=new Scanner(System.in);
			System.out.println("enter the first number:");
			n1=sc.nextInt();
			
//			System.out.println("enter the first number:");
//			n2=sc.nextInt();
			
			n2=Integer.parseInt(args[0]);//array IndexOutOfBound
			System.out.println("division is :"+(n1/n2));
			sc.close();
			
		}
//			catch(Exception e) {//all in one exception
//			System.out.println("erro occured:"+e);
//			
//		}
		catch(NumberFormatException| ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("erro occured:"+e.getMessage());
		}
		
//		catch(ArithmeticException e) {//if already catch then it will not come here
//			System.out.println("erro occured:"+e);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("erro occured:"+e.getMessage());
//		}
		
	}

}
