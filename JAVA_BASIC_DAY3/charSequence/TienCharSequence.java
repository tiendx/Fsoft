package charSequence;

public class TienCharSequence implements CharSequence {

	private String str;

	public TienCharSequence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TienCharSequence(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public char charAt(int arg0) {
		// TODO Auto-generated method stub
		return this.str.charAt(arg0);
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return this.str.length();
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		if (end - start == 0 || end > this.str.length())
			return null;
		else {
			int dem = start;
			char arr[] = new char[end - start + 1];
			for (int i = 0; i < end - start + 1; i++) {
				arr[i] = str.charAt(dem);
				dem = dem + 1;
			}
			String s = new String(arr);
			return s;
		}
	}

	public String reverse() {
		char arr[] = this.str.toCharArray();
		int size = arr.length;
		char[] arrReverse = new char[size];
		for (int i = 0; i < size; i++) {
			arrReverse[size - 1 - i] = arr[i];
		}
		String s = new String(arrReverse);
		return s;
	}

	@Override
	public String toString() {
		return str;
	}

}
