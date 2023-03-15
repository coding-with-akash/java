package arrray;

public class StudentDemo1 {

	private int rollNo;
	private String name;
	
	StudentDemo1(int rollNo,String name){//parameterised constructure
		
		this.rollNo=rollNo;
		this.name=name;
		
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
	
	
}
