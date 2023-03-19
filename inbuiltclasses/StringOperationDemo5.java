package inbuiltclasses;

public class StringOperationDemo5 {
 public static void main(String args[]) {
	 
	 String s1=new String(" Indian ");
	 String s2=s1.toUpperCase();
	 System.out.println(s1);//different hash code
	System.out.println(s2);//different hash code
	
	 System.out.println(s1.length());//include spaces
	 System.out.println(s1.substring(2,5));//5 excluded
	 System.out.println(s2.substring(2));//only starting is given so it will take all
	 
	 System.out.println(s1.trim());//all spaces will he remove
	 System.out.println(s1.strip());//all spaces remove
	 System.out.println(s1.stripTrailing());//all back side spaces are removed
	 System.out.println(s1.isEmpty());//return boolean value
	 System.out.println(s1);
	 
	// String Comparison
	s1 = "Good Morning";//using literal
	s2 = new String(s1);//using new
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	 
	System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));//compare hash code
	System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));//false
 }
}
