package shape;

public class Sphere implements ThreeDimensionalShape {

	private float radius;

	public Sphere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sphere(float radius) {
		super();
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (float) (4 / 3 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	public float getVolume() {
		// TODO Auto-generated method stub
		return (float) (4 / 3 * Math.PI * Math.pow(radius, 3));
	}

	@Override
	public String toString() {
		return "Sphere [radius=" + radius + ",Area=" + this.getArea()
				+ ",Volume=" + this.getVolume() + "]";
	}

}
