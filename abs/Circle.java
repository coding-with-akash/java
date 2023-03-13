package abs;

public class Circle extends Shape {
	
	private float radius;
	
	public Circle() {
		super();
	}
	
	public Circle(float radius) {
		this.radius=radius;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float radius) {
		this.radius=radius;
	}
	
	@Override
	public void calArea() {
		super.area=PI*radius*radius;
	}
	
//	@Override
//	public void calVolume(){
//		super.area=;
	
	
	@Override
	public String toString() {
		return "circle[radius="+radius+",area="+area+"]";
	}
	
	

}
