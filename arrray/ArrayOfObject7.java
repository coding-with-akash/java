package arrray;

public class ArrayOfObject7 {
	
	public static void main(String args[]) {
		
		StudentDemo1[] arr;
		
		arr=new StudentDemo1[5];
		arr[0]=new StudentDemo1(18,"akash");
		arr[1] = new StudentDemo1(2, "Vishal");
		arr[2] = new StudentDemo1(3, "Nidhi");
		arr[3] = new StudentDemo1(4, "Lisha");
		arr[4] = new StudentDemo1(5, "Saurav");
		
        for (int i=0;i<arr.length;i++) {
        	System.out.println("element at "+ i+":"+arr[i].getRollNo()+
        			" "+arr[i].getName());
        }
	}

}
