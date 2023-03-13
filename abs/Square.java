package abs;

public class Square extends Shape{
	private float side;
	
	
	public Square() {
		super();
	}


	public Square(float side) {
		this.side = side;
	}


	public float getSide() {
		return side;
	}


	public void setSide(float side) {
		this.side = side;
	}


	
	@Override
	public void calArea() {
		super.area=side*side;
	}


	@Override
	public String toString() {
		return "Square [side=" + side + ", area=" + area + "]";
	}

}
