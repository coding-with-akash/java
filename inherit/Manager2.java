package inherit;

public class Manager2 extends Employee1{

	private String authority;
	private int teamSize;
	
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {//if void is not written then we have to give return type
		this.authority=authority;//no written type
	}
	public int getTeamSize() {
		return teamSize;
		
	}
	public void getTeamSize(int teamSize) {
		//return teamSize//void method can't give return value
		this.teamSize=teamSize;
	}
	

	public Manager2(String name, String city, int salary, String dept, String authority, int teamSize) {
		super(name, city, salary, dept);
		this.authority = authority;
		this.teamSize = teamSize;
		System.out.println("Manager parameterized constructor");
	}
	public Manager2() {
		super();
		System.out.println("Manager Default constructor");
	}
	public Manager2(String name, String city, int salary, String dept) {
		super(name, city, salary, dept);
		System.out.println("Manager parameterized constructor");
	}
	@Override
	public String toString() {
		return "Manager2 [authority=" + authority + ", teamSize=" + teamSize + ", getSalary()=" + getSalary()
				+ ", getDept()=" + getDept() + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
	
	@Override
	public void show()//we can override and outcome depends on class object
	{
		System.out.println("In Manager show()");
		//super.show();
	}
	
	
}
