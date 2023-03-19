package inbuiltclasses;

class Sample{
	//there is default constructor with no arguments
}

class Demo{
	public Demo() {
		//resource allocation
		System.out.println("in defult constructor");
	}
	
	protected void finalize() throws Throwable{
		//resource cleanup code
		System.out.println("in finalize");

	}
}



public class ObjectClassDemo0 {
    public static void main(String[] args) {
    	Sample s=new Sample();
    	Sample s1=new Sample();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		Demo d=new Demo();//constructor get called
		System.out.println(d.hashCode());
		Demo d1=d;//d1 pointing to same memory location as d
//		Demo d1=new Demo();//new memory has been assigned
		System.out.println(d1.hashCode());
		d=null;//only d pointing will be deleted
		System.gc(); //reuse the space memory created
		System.out.println(d1.hashCode());
		

    }
}
