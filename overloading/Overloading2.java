package overloading; //compile time is also known as checked 

public class Overloading2 {

	public static void main(String args[]) {
		Operation1.add();
		Operation1.add(10);
		Operation1.add(10,20);
		Operation1.add(10.89f,40);
		Operation1.add(10,49.00f);
		Operation1.add(10f,23.88f);
		Operation1.add(10.99f);
		
	}
}
