package shape;

public class Tetrahedron implements ThreeDimensionalShape {

	private float a, b, c, h;

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Tetrahedron(float a, float b, float c, float h) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		this.h = h;
	}

	@Override
	public float getVolume() {
		// TODO Auto-generated method stub
		float p = (a + b + c) / 2;
		return h * ((float) Math.sqrt(p * (p - a) * (p - b) * (p - c)));
	}

	@Override
	public String toString() {
		return "Tetrahedron [a=" + a + ", b=" + b + ", c=" + c + ", h=" + h
				+ ",Volume="+this.getVolume()+"]";
	}
	
	

}
