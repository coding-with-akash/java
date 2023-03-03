package basic;

public class Demo2 {
	void main()
	{
		System.out.println("In void main()");
	}
	public static void main(int a[])
	{
		System.out.println("In int main(int[])");
	}
	public static void main(String args[])
	{
		System.out.println("In java string main()");
		int a[]= {1,2,3};
		main(a);
	}
}
