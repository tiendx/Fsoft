package quan_ly_lop_hoc;

public class Test {
	public static void main(String[] args) {

		int size = 25;
		ListStudent ods = new ListStudent();
		ods.genericDanhSach(size);
		ods.getDsSinhVien();
		System.out.println(ods);
	}
}
