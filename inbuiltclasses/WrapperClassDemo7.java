package inbuiltclasses;

public class WrapperClassDemo7 {
	public static void main(String[] args) {
		
		//unboxing
//		Integer i=new Integer(20);//use in old 
		Integer i=10;//both are same
		System.out.println(i);
		
		int b=i.intValue();
		System.out.println(b);
		
		//without using intValue
		int a=i;
		System.out.println(a);
		
		//autoboxing
		int c=100;//simple variable
		Integer i1=c;//i1 is object assigned value 100
		System.out.println(i1);
		
		
		
	}
}
