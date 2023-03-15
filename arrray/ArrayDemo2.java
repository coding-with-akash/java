package arrray;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int n=10;
		int a[];//declaration of an array
		// int[] a;
		a=new int[n];//instantiation of an array
		
		
		ArrayOperation3.printArray(a);//all will be zeros as no data is pass
		
		for (int i = 0;i<a.length;i++) {
			a[i]=5*i;//adding data to array
		}
		
		ArrayOperation3.printArray(a);
		
		
		int b[]= {10,20,30,40,50,60};//initalization at the time of declaration

		ArrayOperation3.printArray(b);
		
		System.out.println("sum of array elemnt is "+ArrayOperation3.getSum(b));
		System.out.println("sum of array elemnt is "+ArrayOperation3.getSum(10,20));
		System.out.println("sum of array elemnt is "+ArrayOperation3.getSum(10,20,30));

		
		
		b[2]=999;//manipulation
		
		ArrayOperation3.printArray(b);
		
		
		int c[];
       //ArrayOperation3.printArray(c); //only declare no value pass
	}

}
