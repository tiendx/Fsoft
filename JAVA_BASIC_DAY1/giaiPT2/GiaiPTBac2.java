package giaiPT2;

import java.util.Scanner;

public class GiaiPTBac2 {
	private float a, b, c;

	public GiaiPTBac2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaiPTBac2(float a, float b, float c) {
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

	/* Giai phuong trinh: ax^2 + bx + c = 0 */
	public String GiaiPT() {
		String str_Nghiem = "";
		float delta;
		if (a == 0) {
			if (b == 0) {
				if (c == 0)
					str_Nghiem = "PT Vo so nghiem";
				else
					str_Nghiem = "PT vo nghiem";
			} else {
				str_Nghiem = "PT co 1 nghiem:" + (-c / b);
			}
		} else {
			delta = b * b - 4 * a * c;
			if (delta < 0)
				str_Nghiem = "PT vo nghiem";
			else if (delta == 0)
				str_Nghiem = "PT co nghiem kep:x1=x2=" + (-b / (2 * a));
			else {
				str_Nghiem = "PT co 2 nghiem:x1="
						+ ((-b - Math.sqrt(delta)) / (2 * a)) + "," + "x2="
						+ ((-b + Math.sqrt(delta)) / (2 * a));
			}
		}
		return str_Nghiem;
	}
	
	public static void main(String []args){
		float a,b,c;
		Scanner nhap = new Scanner(System.in);
		System.out.printf("Nhap a:");
		a=nhap.nextFloat();
		System.out.printf("Nhap b:");
		b=nhap.nextFloat();
		System.out.printf("Nhap c:");
		c=nhap.nextFloat();
		GiaiPTBac2 ptb2 = new GiaiPTBac2(a,b,c);
		System.out.print(ptb2.GiaiPT());
	}
}
