package access;
import std.Student0;
public class StudentDemo1 {

	public static void main(String args[]){
	Student0 s1=new Student0();
	s1.setId(11);
	s1.setName("akash");
	s1.setPer(88.80f);
	System.out.println(s1);
	System.out.println("-------------");
	
	Student0 s2=new Student0(07,"aarti",66.97f);
	System.out.println(s2);
	
	StudentAchievements2 sd= new StudentAchievements2(100,"radha",90.00f,"running");
	//sd.id=112;//private not accessible
	//sd.name="vikas";//protected not accessible outside the class with in another package using object
	//sd.per=75f;//default not accessible outside the class within another package
	System.out.println(sd);
}
}
