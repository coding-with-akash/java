package exception;

@SuppressWarnings("serial")
public class UserException4 extends Exception {

	public UserException4(){//default constructor
		super("invalid age");
	}
	public UserException4(String s){//Parameterized constructor
		super(s);
		System.out.println("nothing to tell");
	}
}
