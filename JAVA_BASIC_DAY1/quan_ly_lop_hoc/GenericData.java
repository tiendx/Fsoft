package quan_ly_lop_hoc;

import java.util.ArrayList;
import java.util.Random;

public class GenericData {
	String ten[] = { "Nam", "Dung", "Quy", "Huyen", "Vinh", "Thuy", "Phu",
			"Lam", "Quan", "Thao", "Tien", "Hoa", "Hieu", "Tu", "Bach", "Yen",
			"Hong", "Duc", "Thinh", "Quyet", "Luong", "Kien", "Trung", "Nam",
			"Thu", "Thanh", "Phuong", "Anh", "Huy", "Dong", "Tuan", "Thang",
			"Quyen", "Thong", "Uan", "Hien", "Mui", "Giang", "Huong", "He",
			"Huom", "Mai", "Dao", "Man", "Tai", "Linh", "Tham", "Tinh", "Bung" };
	String tenHo[] = { "An", "Bui", "Chiem", "Trinh", "Nguyen", "Ba", "Lai",
			"Lac", "Le", "Tong", "Nong", "Rie", "Cotu", "H'ro", "Tran" };
	String tenDem[] = { "Ngoc", "Nguyet", "Gia", "Minh", "Bao", "Kim", "My",
			"Thanh", "Gia", "Lan", "Quynh", "Van", "Thien", "Tue", "Hien",
			"Hong", "Nhu", "An", "Anh", "An", "The", "Dang", "Thien", "Uy",
			"Manh", "Huu", "Khoi", "Tan", "Tien", "Manh" };

	public GenericData() {
		super();
	}

	// Sinh ra ten
	public ArrayList<String> GenericName(int size) {
		int d = 0;
		String str = "";
		if (size > 0) {
			Random rn = new Random();
			ArrayList<String> hvt = new ArrayList<String>();
			while (d < size) {
				str = tenHo[rn.nextInt(tenHo.length)] + " "
						+ tenDem[rn.nextInt(tenDem.length)] + " "
						+ ten[rn.nextInt(ten.length)];
				str = str.trim();
				if (hvt.contains(str) == false) {
					hvt.add(str);
					d = d + 1;
				}

			}
			return hvt;
		} else {
			return null;
		}
	}

	// Sinh ma sinh vien
	public ArrayList<String> genericKey(int size) {
		String str = "";
		int d = 0;
		if (size > 0) {
			Random rd = new Random();
			ArrayList<String> maSV = new ArrayList<String>();
			while (d < size) {
				str = "HV" + rd.nextInt(9) + rd.nextInt(9) + rd.nextInt(9)
						+ rd.nextInt(9) + rd.nextInt(9) + rd.nextInt(9)
						+ rd.nextInt(9);
				str = str.trim();
				if (maSV.contains(str) == false) {
					d = d + 1;
					maSV.add(str);
				}
			}
			return maSV;
		} else {
			return null;
		}
	}

	// Sinh ngay thang nam sinh
	public ArrayList<String> genericBirthday(int size) {
		String str = "";
		Random rd = new Random();
		int d = 0;
		if (size < 1)
			return null;
		else {
			ArrayList<String> namSinh = new ArrayList<String>();
			while (d < size) {
				str = (1 + rd.nextInt(30)) + "/" + (1 + rd.nextInt(11))
						+ "/1991";
				// xu ly khoang trang o dau va cuoi;
				str = str.trim();
				if (!namSinh.contains(str)) {
					namSinh.add(str);
					d = d + 1;
				}
			}
			return namSinh;
		}
	}

	// Sinh diem mot mon hoc cho size hoc vien
	public float[] genericMark(int size) {
		Random rd = new Random();
		float arr[] = new float[size];
		float gen = 0;
		int danhDau[] = new int[5];
		int d = 0;
		while (d < size) {
			gen = rd.nextInt(11) + rd.nextFloat();
			// Lam trong 2 so sau dau phay
			gen = Math.round(gen * 10);
			gen = gen / 10;
			if (gen == 0) {
				if (danhDau[0] == 0) {
					arr[d] = 0;
					danhDau[0] = danhDau[0] + 1;
					d = d + 1;
				}
			} else if (gen >= 1 && gen <= 2) {
				if (danhDau[1] <= 1) {
					arr[d] = gen;
					danhDau[1] = danhDau[1] + 1;
					d = d + 1;
				}

			} else if (gen >= 3 && gen <= 4) {
				if (danhDau[2] <= 5) {
					arr[d] = gen;
					danhDau[2] = danhDau[2] + 1;
					d = d + 1;
				}

			} else if (gen >= 5 && gen <= 7) {
				if (danhDau[3] <= 12) {
					arr[d] = gen;
					danhDau[3] = danhDau[3] + 1;
					d = d + 1;
				}

			} else if (gen >= 8 && gen <= 10) {
				if (danhDau[4] <= 2) {
					arr[d] = gen;
					danhDau[4] = danhDau[4] + 1;
					d = d + 1;
				}

			} else {

			}
		}
		return arr;
	}

}
