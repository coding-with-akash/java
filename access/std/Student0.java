package std;

public class Student0 {
       private int id;
       protected String name;
       float per;
	public int getId() {
		return id;
	}
	
	public Student0() {
		System.out.println("default --- constructor");
	}
	public Student0(int id,String name,float per) {
		this.id=id;
		this.name=name;
		this.per=per;
		System.out.println("parameterised constructor");
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
	public String toString() {
		return "Student0 [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
       
}

