package inbuiltclasses;

public class WrapperClass6 {

	public static void main(String args[]) {
		System.out.println("Hello World");
		
		//use variable as object
		int a=Integer.parseInt(args[0]);//args are initially string so we have to convert it into int
		int b=Integer.parseInt(args[1]);//args are initially string so we have to convert it into int
		int c=a+b;
		System.out.println(c);


	}
}
