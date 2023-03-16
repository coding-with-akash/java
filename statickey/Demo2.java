package statickey;

public class Demo2 {
	static {
		System.out.println("--------------------");
	}
	static {
		System.out.println("---akash from jalna");
	}
	

	public static void main(String args[]) {
		System.out.println("---------In main----------");
		Student1 s1=new Student1();
		s1.setName("Gangubai");
		s1.setPer(88.88f);
//		Student1 s2=new Student1();
//		s2.setName("Indubai");
//		s2.setPer(90.08f);
//		Student1.show();//first all static block and both  default constructor will be called
//		Student1.show();//first all default constructor will be called
//		System.out.println(s1);
//		System.out.println(s2);
		
	}
}
