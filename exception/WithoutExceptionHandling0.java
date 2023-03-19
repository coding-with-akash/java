package exception;

public class WithoutExceptionHandling0 {

	public static int intDivision(int a,int b) {
		return a/b;
	}
	
	public static float division(int a,int b) {
		return a/b;
	}
	
	public static float floatDivision(float a,float b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		System.out.println("Division is " + intDivision(10, 3));
		System.out.println("Division is " + division(10, 3));
		System.out.println("Division is " + floatDivision(10, 3));

		System.out.println("Division is " + intDivision(10, 200));//value will be 0
		System.out.println("Division is " + division(10, 200));//value will be 0.0
		System.out.println("Division is " + floatDivision(10, 200));//value will be 0.05

//		System.out.println("Division is " + division(10, 0));//error
		System.out.println("Division is " + floatDivision(10, 0));//infinity
//		System.out.println("Division is " + intDivision(10, 0));//error

		System.out.println("------------------------------------------");
	}
}
