package basic;

public class StudentDemo4 {

	public static void main(String[] args) {
		
		Student3 s1=new Student3();
		
		/*
		 * s1.id=3;//can't be access outside the class 
		 * s1.per=4;//her default can be set directly outside the class within same package 
		 * s1.name="akash"; //protected can also be access outside the class within same package
		 * 
		 * System.out.println(s1.name+" "+s1.per);
		 */
		
		s1.setId(18);
		s1.setName("akash");
		s1.setPer(88.85f);//here f is important
		//System.out.println(s1);//here toString is default
		System.out.println(s1.toString());
		
		
		
		/*
		 * s1.setId(20); //here it gets overide s1.setName("vikas");
		 * s1.setPer(88.85f);//here f is important System.out.println(s1);//here
		 * toString is default System.out.println(s1.toString());
		 */
		
		Student3 s2 =new Student3(); //here default constructor is called once again
		s2.setId(20);
		s2.setName("vikas");
		s2.setPer(88f);//here f is important
		System.out.println(s2);//here toString is default
		
		
		Student3 s3 =new Student3(21,"aarti",79f);//here parametrised constructor is called
		System.out.println(s3);
		
		s3.name="pushpa";//here name gets override
		System.out.println(s3);
		
		System.out.println("------------------------");
		StudentResult5 s5=new StudentResult5(21,"pushpa",79f);
		System.out.println(s5);
		
	}

}
