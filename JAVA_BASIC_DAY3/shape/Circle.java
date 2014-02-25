package shape;


public class Circle implements TwoDemensionalShape {

	private float radius;	// Ban kinh duong tron

	 
	public float getRadius() {
		return radius;
	}


	public void setRadius(float radius) {
		this.radius = radius;
	}


	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Circle(float radius) {
		super();
		this.radius = radius;
	}


	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (float) Math.PI;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ",Area="+this.getArea()+"]";
	}
	
}
