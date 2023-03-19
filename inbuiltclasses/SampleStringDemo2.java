package inbuiltclasses;

public class SampleStringDemo2 {
	public static void main(String args[]) {
		char c[]= {'I','n','d','i','a'};//array of characters
		
		String s1=new String(c);//String is inbuilt class
		String s2=new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		String longStr = "This is to show " + "how string concatination " + "can happen with additional  "
				+ "operator.";
		System.out.println(longStr);
	}
}
