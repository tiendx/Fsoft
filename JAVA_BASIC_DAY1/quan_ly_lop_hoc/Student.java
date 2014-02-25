package quan_ly_lop_hoc;

public class Student {
	private String ma;
	private String hoTen;
	private String ngaySinh;
	private float RequirementAnalyze, softwareDesign, CProgramming, CodeTest,
			FSoftManagementTool;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String ma, String hoTen, String ngaySinh,
			float requirementAnalyze, float softwareDesign, float cProgramming,
			float codeTest, float fSoftManagementTool) {
		super();
		this.ma = ma;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		RequirementAnalyze = requirementAnalyze;
		this.softwareDesign = softwareDesign;
		CProgramming = cProgramming;
		CodeTest = codeTest;
		FSoftManagementTool = fSoftManagementTool;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public float getRequirementAnalyze() {
		return RequirementAnalyze;
	}

	public void setRequirementAnalyze(float requirementAnalyze) {
		RequirementAnalyze = requirementAnalyze;
	}

	public float getSoftwareDesign() {
		return softwareDesign;
	}

	public void setSoftwareDesign(float softwareDesign) {
		this.softwareDesign = softwareDesign;
	}

	public float getCProgramming() {
		return CProgramming;
	}

	public void setCProgramming(float cProgramming) {
		CProgramming = cProgramming;
	}

	public float getCodeTest() {
		return CodeTest;
	}

	public void setCodeTest(float codeTest) {
		CodeTest = codeTest;
	}

	public float getFSoftManagementTool() {
		return FSoftManagementTool;
	}

	public void setFSoftManagementTool(float fSoftManagementTool) {
		FSoftManagementTool = fSoftManagementTool;
	}

	// Lay diem trung binh
	public float averageMark() {
		return (this.RequirementAnalyze + this.softwareDesign
				+ this.CProgramming + this.CodeTest + this.FSoftManagementTool) / 5;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		float tb = this.averageMark();
		tb = Math.round(tb * 100);
		tb = tb / 100;
		String xepLoai = "";
		if (tb >= 8)
			xepLoai = "Gioi";
		else if (tb >= 6.5 && tb < 8)
			xepLoai = "Kha";
		else if (tb >= 5 && tb < 6.5)
			xepLoai = "Trung Binh";
		else if (tb >= 3 && tb < 5)
			xepLoai = "Yeu";
		else
			xepLoai = "Kem";
		
		return this.ma+"  "+this.hoTen + "   " + this.ngaySinh + "  "
				+ this.RequirementAnalyze + "  " + this.softwareDesign + "   "
				+ CProgramming + "   " + CodeTest + "   " + FSoftManagementTool
				+ "    TB=" + tb + "   XepLoai:" + xepLoai;
	}
}
