package charSequence;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TienCharSequence tdx = new TienCharSequence("Dang Xuan Tien");
		// Do dai cua chuoi
		System.out.println("Do dai cua [" + tdx.getStr() + "] La:"
				+ tdx.length());
		// Ky tu tai vi tri 2
		System.out.println("Ki tu tai vi tri 2 cua [" + tdx.getStr() + "] La :"
				+ tdx.charAt(2));
		System.out.println("chuoi con tu vi tri " + 2
				+ " Toi vi tri 5 cua chuoi [" + tdx.getStr() + "] La :"
				+ tdx.subSequence(2, 5));
		System.out.print("Chuoi truoc khi dao:");
		System.out.println(tdx);
		System.out.print("Chuoi sau khi dao:");
		System.out.println(tdx.reverse());
	}

}
