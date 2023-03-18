package inherit;

public class Employee1 extends Person0 {
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
	
	public Employee1(String name, String city, int salary, String dept) {
		super(name, city);	
		this.salary = salary;
		this.dept = dept;
		System.out.println("Employee class parameterized constructor");
		
	}
	
	public Employee1() {
		super();	//correct place
		System.out.println("Employee class Default constructor");
		//super(); base constructor must be first statement in child class constructor
		
	}
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + ", Name=" + getName() + ", City=" + getCity()
				+ "]";
	}
	
	//@Override
		public  void show()//we can override and outcome depends on class object
		{
			System.out.println("In Employee show()");
			//super.show();
		}
	

	
}
