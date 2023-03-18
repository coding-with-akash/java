package inherit;

public class InheritMainClass4 {

	public static void main(String args[]) {
		Manager2 m1=new Manager2();//static binding
		System.out.println(m1);//it will give null values for string initaialy and zero for int values
		Manager2 m2=new Manager2("Sonali","nashik",25000,"computer","pvgcoen",4);
		System.out.println(m2);
		
//		m2.show();
		
		Person0 p;//dyinamic binding//default constructor call
		p=new Person0();
		p.show();
		
		p=new Manager2();
		p.show();
		
		p=new Employee1();
		p.show();
		
	}
}
