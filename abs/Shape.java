package abs;

abstract public class Shape {
	protected float area;
	protected float volume;
	protected static final float PI=3.14f;
	
	public void show(){
		System.out.println("Area of shape is "+area);
	}
	
	public abstract void calArea();
//	public abstract void calVolume();
}
