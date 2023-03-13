package abs;

public class Triangle extends Shape {
	
	private float base;
	private float height;
	private float length;
	
	public Triangle() {
		super();
	}
	public Triangle(float base,float height) {
		this.base=base;
		this.height=height;
	}
	/*
	 * public Triangle(float base,float height,float length) { this.base=base;
	 * this.height=height; this.length=length; }
	 */


	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public void calArea() {
		super.area=0.5f*base*height;
	}

	/*
	 * @Override public void calVolume(){ super.area=0.5f*base*height*length; }
	 */
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", area=" + area +"volume=" +volume+"]";
	}
	

}
