package exception;

public class FinallySecond7 {
   public static void main(String args[]) {
try {
	   System.out.println("In try block");
	   
		/*
		 * while (true){
		 * 
		 * }
		 */
	   System.out.println("-----------------");
       System.exit(0);//program will be terminated no finally will run
       throw new ArithmeticException("error");
   }
   catch(Exception e){
	   System.out.println("In catch block"+e);

   }
	finally {
		   System.out.println("In final block");

	}
System.out.println("---------------------------");

}
}
   
