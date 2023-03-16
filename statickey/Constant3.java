package statickey;

public class Constant3 {
 
	final int N=1000;
	static final int STATIC_N;//Constant must be capital
	
	public Constant3() {
		System.out.println("--------------");
	}
	static {
		STATIC_N=5000;
	}
	public static void main(String args[]) {
		Constant3 con=new Constant3();
		System.out.println(con.N);
		//con.N++; //can't be incremented as final
		System.out.println(Constant3.STATIC_N);
		//STATIC_N++;//can't be assigned
	}
}
