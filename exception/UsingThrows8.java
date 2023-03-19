package exception;

public class UsingThrows8 {
	
	public static int count(String s) throws NullPointerException{//don't need to handle here it will be handle where it will be get called
		int c=0;
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if (Character.isWhitespace(ch)) {
				c++;
			}
		}
		return c;
	}

	public static void main(String args[]) {
		String s=null;
		try {
			System.out.println("no of spaces= "+count("hello!\t How are you?"));
			System.out.println("no of spaces= "+count(s));//nullPointerException
		}
		catch(Exception e) {
			System.out.println("error occured: "+e);
		}
		
	}
	
}
