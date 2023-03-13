package abs;

public class ShapeDemo {
public static void main(String[] args) {
//	Shape s=new Circle(5.4f); //static binding
	Shape s;
	s=new Circle(5.4f);//dynamic binding
	s.calArea();
	System.out.println(s);
//	s=new Triangle(10f,10f,10f);
//	s.calArea();
//	s.calVolume();
	System.out.println(s);
	s=new Square(10f);
	s.calArea();
	System.out.println(s);
	

}
}
