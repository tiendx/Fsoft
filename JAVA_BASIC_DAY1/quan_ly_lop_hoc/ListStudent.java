package quan_ly_lop_hoc;

import java.util.ArrayList;

public class ListStudent {
	private ArrayList<Student> dsSinhVien;

	public ListStudent(ArrayList<Student> dsSinhVien) {
		super();
		this.dsSinhVien = dsSinhVien;
	}
	
	public ListStudent() {
		super();
		dsSinhVien = new ArrayList<Student>();
		// TODO Auto-generated constructor stub
	}
	public void genericDanhSach(int size){
		// Sinh ma sinh vien
				GenericData gn1 = new GenericData();
				ArrayList<String> sv_ma = gn1.genericKey(size);
				// lay danh sach ho ten
				ArrayList<String> sv_hoten = gn1.GenericName(size);
				// lay danh sach ngay sinh
				ArrayList<String> sv_ngaySinh = gn1.genericBirthday(size);
				// lay danh sach diem 1 mon
				float mon1[] = gn1.genericMark(size);
				float mon2[] = gn1.genericMark(size);
				float mon3[] = gn1.genericMark(size);
				float mon4[] = gn1.genericMark(size);
				float mon5[] = gn1.genericMark(size);
				int d=0;
				while(d<size&&size>0) {
					Student sd = new Student();
					sd.setMa(sv_ma.get(d));
					sd.setHoTen(sv_hoten.get(d));
					sd.setNgaySinh(sv_ngaySinh.get(d));
					sd.setCodeTest(mon1[d]);
					sd.setCProgramming(mon2[d]);
					sd.setFSoftManagementTool(mon3[d]);
					sd.setRequirementAnalyze(mon4[d]);
					sd.setSoftwareDesign(mon5[d]);
					d=d+1;
					dsSinhVien.add(sd);
				}
	}

	public ArrayList<Student> getDsSinhVien() {
		return dsSinhVien;
	}

	public void setDsSinhVien(ArrayList<Student> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}
	
	// Sap xep sinh vien theo ho ten
	public void sapXepSV(){
		
	}
	// Sap xep sinh vien theo diem
	public void sapxepDiem(){
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str= new StringBuffer();
		for(int i=0;i<dsSinhVien.size();i++) {
			str.append(i+1);
			str.append("   "+dsSinhVien.get(i));
			str.append("\n");
		}
			
		return str.toString();
	}
	
	

}
