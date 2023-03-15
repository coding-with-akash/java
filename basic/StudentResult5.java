package basic;

public class StudentResult5 extends Student3{
	

	String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {//id is private can't be generated
		return "StudentResult5 [grade=" + grade + ", name=" + name + ", per=" + per + "]";
	}
	
	public StudentResult5() {
		super();
	}

	public StudentResult5(int id,String name,float per) {
		super(id,name,per);
		
		if(super.per>=90)
			grade="O";
		else if(super.per>=80)
			grade="A+";
		else if(super.per>=80)
			grade="A";
		else if(super.per>=80)
			grade="B+";
		else if(super.per>=80)
			grade="B";
		else if(super.per>=80)
			grade="c+";
		else if(super.per>=80)
			grade="c";
		else
			grade="F";

	}

}
