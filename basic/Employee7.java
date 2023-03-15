package basic;

public class Employee7 extends Person6{
      private int salary;
      private String dept;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Employee7() {
		super();//default is called of person6
		System.out.println("default employee7");
		
	}
	public Employee7(String name,String city,int salary,String dept) {
		super(name,city);
		this.salary=salary;
		this.dept=dept;
		System.out.println("parameterised employee7");
	}
	@Override
	public String toString() {
		return "Employee7 [salary=" + salary + ", dept=" + dept +" name="+getName()+" city="+getCity()+"]";//due to private it can't be inherited
	}
	
	
      
}
