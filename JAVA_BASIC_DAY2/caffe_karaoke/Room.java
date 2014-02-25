package caffe_karaoke;

public class Room {
	private String ma_phong;
	private String ten_phong;
	private int loai_phong;
	private long don_gia;
	private DateService thoi_gian_vao;
	private DateService thoi_gian_ra;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(String ma_phong, String ten_phong, int loai_phong,
			long don_gia) {
		super();
		this.ma_phong = ma_phong;
		this.ten_phong = ten_phong;
		this.loai_phong = loai_phong;
		this.don_gia = don_gia;
	}
	public String getMa_phong() {
		return ma_phong;
	}
	public void setMa_phong(String ma_phong) {
		this.ma_phong = ma_phong;
	}
	public String getTen_phong() {
		return ten_phong;
	}
	public void setTen_phong(String ten_phong) {
		this.ten_phong = ten_phong;
	}
	public int getLoai_phong() {
		return loai_phong;
	}
	public void setLoai_phong(int loai_phong) {
		this.loai_phong = loai_phong;
	}
	public long getDon_gia() {
		return don_gia;
	}
	public void setDon_gia(long don_gia) {
		this.don_gia = don_gia;
	}
	public DateService getThoi_gian_vao() {
		return thoi_gian_vao;
	}
	public void setThoi_gian_vao(DateService thoi_gian_vao) {
		this.thoi_gian_vao = thoi_gian_vao;
	}
	public DateService getThoi_gian_ra() {
		return thoi_gian_ra;
	}
	public void setThoi_gian_ra(DateService thoi_gian_ra) {
		this.thoi_gian_ra = thoi_gian_ra;
	}
	
	public float getKhoangThoiGian(){
		int gio=thoi_gian_ra.getGio()-thoi_gian_vao.getGio();
		int phut=thoi_gian_ra.getPhut()-thoi_gian_vao.getPhut();
		
		float khoangTG=gio+ (float)phut/60;
		khoangTG=Math.round(khoangTG*10);
		khoangTG=khoangTG/10;
		return khoangTG;
	}
	
	
}
