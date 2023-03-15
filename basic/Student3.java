package basic;

public class Student3 {
	private int id;
	protected String name; 
	float per; //default
	
	public Student3() {
		System.out.println("default constructor");
	}
	public Student3(int id,String name,float per) {
		this();//call to default constructor
		this.id=id;
		this.name=name;
		this.per=per;
		System.out.println("parameterised constructor");
	}
	public int getId() { //when there is default constructor
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String toString() { //get called automatically when object is called
		return "Student3 [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	
	

}
