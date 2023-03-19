package inbuiltclasses;

public class StringComparision4 {
	public static void main(String[] args) {
		
		String s1="India";//created using literals
		String s2="India";//created using literals
		
		String s3=new String("India");//created string using new operator
		String s4=new String("India");//created string using new operator
		
		//equals is comparison operation which  check hash code
		//==check 
		System.out.println("s1 == s2 :" + (s1 == s2) + "\ts1 equals s2 : " + s1.equals(s2));
		System.out.println("s1 == s3 :" + (s1 == s3) + "\ts1 equals s3 : " + s1.equals(s3));
		System.out.println("s4 == s3 :" + (s4 == s3) + "\ts4 equals s3 : " + s4.equals(s3));
		
		System.out.println(s1.hashCode());//70793495
		System.out.println(s2.hashCode());//70793495
		System.out.println(s3.hashCode());//70793495
		System.out.println(s4.hashCode());//70793495
		
		//compareTo 
		System.out.println(s1.compareTo("india"));//ASCII comparison =-32
		System.out.println(s1.compareToIgnoreCase("india"));//ASCII comparison = 0
		System.out.println(s1.compareTo(s2));//ASCII comparison=0
	}
}
