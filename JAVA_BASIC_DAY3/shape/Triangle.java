package shape;


public class Triangle implements TwoDemensionalShape{

	private float a,b,c;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(float a, float b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		float p=(this.a+this.b+this.c)/2;
		return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ",Area="+this.getArea()+"]";
	}

}
