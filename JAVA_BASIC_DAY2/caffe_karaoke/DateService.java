package caffe_karaoke;

public class DateService {
	private int phut;
	private int gio;
	private int ngay;
	private int thang;
	private int nam;
	public DateService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DateService(int phut, int gio, int ngay, int thang, int nam) {
		super();
		this.phut = phut;
		this.gio = gio;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	public int getPhut() {
		return phut;
	}
	public void setPhut(int phut) {
		this.phut = phut;
	}
	public int getGio() {
		return gio;
	}
	public void setGio(int gio) {
		this.gio = gio;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	
	
}
