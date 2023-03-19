package inbuiltclasses;

public class StringBuffer8 {//mutable String
	public static void main(String[] args) {
		
		StringBuffer buffer=new StringBuffer();
		System.out.println("buffer= "+buffer);
		System.out.println("buffer length= "+buffer.length());
		System.out.println("buffer capacity= "+buffer.capacity());//Initially 16
		
		String s;
		int a=42;
		buffer=new StringBuffer(40);//capacity is given
		s=buffer.append("a= ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer = new StringBuffer("I Java!");
		buffer.insert(2, "like  ");//position + value is given
		System.out.println(buffer);
		
		buffer.delete(7,10);//from 7 to 9
		System.out.println(buffer);
		System.out.println(buffer.reverse());
	}
}
