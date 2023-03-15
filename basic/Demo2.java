package basic;

public class Demo2 {
	 void main() //function call in main
	{
		System.out.println("In void main()");
	}
	public static void main(int a[])//function
	{
		System.out.println("In int main(int[])");
	}
	public static void main(String args[])//main function
	{
		System.out.println("In java string main()");
		int a[]= {1,2,3};
		main(a);
		Demo2 d=new Demo2();
		d.main();
	}
}
