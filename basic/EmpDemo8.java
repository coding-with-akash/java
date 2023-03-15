package basic;

public class EmpDemo8 {
 public static void main(String[] args) {
	 
	 Employee7 emp=new Employee7();
	 emp.setCity("jalna");
	 emp.setDept("computer");
	 emp.setName("akash");
	 emp.setSalary(10000);
	 
	 System.out.println(emp);
	 
	 Employee7 emp2=new Employee7("vikas","jalna",1098,"commerce");
	 System.out.println(emp2);
 }
}
