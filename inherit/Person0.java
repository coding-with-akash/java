package inherit;

public class Person0 {

	private String name;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Person0(String name, String city) {
		this.name = name;
		this.city = city;
		System.out.println("Person class parameterized constructor");
	}

	
	public Person0() {
		super();
		System.out.println("Default Constructor of Person");
	}

	@Override
	public String toString() {
		return "Person0 [name=" + name + ", city=" + city + "]";
	}
	
	public void show() {//we can override and outcome depends on class object
		System.out.println("IN person show()");
	}
	
	
}
