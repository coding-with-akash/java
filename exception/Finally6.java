package exception;

public class Finally6 {
   public static void main(String args[]) {
	   try {
	   System.out.println("In the try block");
	   throw new ArithmeticException("error");
	   }
	   catch(Exception e) {
	   System.out.println("In the catch block: "+e);
	   }
	   finally {//this will run whatever happens
		   System.out.println("In the final block");
	   }
	   System.out.println("-----------------------");

	   
   }
}
