package overloading;

public class Operation1 {

	//all are example of overloading
	public static void add() {
		System.out.println("addition of numbers");
	}
	public static void add(int n) {
		System.out.println("addition of numbers"+n);
	}
	public static void add(int n1,int n2) {
		System.out.println("addition of numbers"+(n1+n2));
	}
	public static void add(float n) {
		System.out.println("addition is " + n);
	}

	public static void add(float n1, float n2) {
		System.out.println("addition is " + (n1 + n2));
	}
	
	public static void add(int n1, float n2) {
		System.out.println("addition is " + (n1 + n2));
	}
	
	public static void add(float n1, int n2) {
		System.out.println("addition is " + (n1 + n2));
	}
}
