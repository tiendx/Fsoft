package shape;

public class Cube implements ThreeDimensionalShape {

	private float rong;
	private float dai;
	private float cao;

	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cube(float rong, float dai, float cao) {
		super();
		this.rong = rong;
		this.dai = dai;
		this.cao = cao;
	}

	public float getRong() {
		return rong;
	}

	public void setRong(float rong) {
		this.rong = rong;
	}

	public float getDai() {
		return dai;
	}

	public void setDai(float dai) {
		this.dai = dai;
	}

	public float getCao() {
		return cao;
	}

	public void setCao(float cao) {
		this.cao = cao;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return 2 * (rong * dai + rong * cao + dai * cao);
	}

	@Override
	public float getVolume() {
		// TODO Auto-generated method stub
		return (dai * rong * cao);
	}

	@Override
	public String toString() {
		return "Cube [rong=" + rong + ", dai=" + dai + ", cao=" + cao
				+ ",Area=" + this.getArea() + ",Volume=" + this.getVolume()+"]";
	}

}
