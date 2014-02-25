package shape;

public class Square implements TwoDemensionalShape {

	private float width;
	private float height;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (this.height * this.width);
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", height=" + height + ",Area="
				+ this.getArea() + "]";
	}

}
