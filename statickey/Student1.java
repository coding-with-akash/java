package statickey;

public class Student1 {

	private int rollNo;
	private String name;
	private float per;
	private static String classTeacher;
	private static int cnt;
	
	public Student1() {//second most thing call in class
		System.out.println("Default Constructor");
		cnt++;//as it is static it will override same memory
		rollNo=cnt;
	}
	
	static {//first thing call in class
		System.out.println("Static block--------");
		cnt=2000;
		classTeacher="alpana sonje";
		System.out.println(classTeacher);
	}
	
	static void show() {
		System.out.println("counter is "+cnt);
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	

	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", name=" + name + ", per=" + per + " classTeacher="+classTeacher+"]";
	}
	
}
