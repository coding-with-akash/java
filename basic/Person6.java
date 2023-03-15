package basic;

public class Person6 {
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
	
	public Person6() {
		super();
		System.out.println("default constructor of person");
	}
	
	public Person6(String name,String city) {
		super();
		this.name=name;
		this.city=city;
		System.out.println("parameterised constructor of person");
	}
	@Override
	
	public String toString() {
		return "person[name="+name+"city="+city+"]";
	}
	
	

}
