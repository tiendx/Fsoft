package caffe_karaoke;
/*
 * Lop chua thong tin do an, do uong
 */
public class Good {
	private String ma_good;
	private String ten_good;
	private long don_gia;
	private DateService thoiGian;		// Thoi gian su dung dich vu
	public Good(String ma_good, String ten_good, long don_gia) {
		super();
		this.ma_good = ma_good;
		this.ten_good = ten_good;
		this.don_gia = don_gia;
	}
	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMa_good() {
		return ma_good;
	}
	public void setMa_good(String ma_good) {
		this.ma_good = ma_good;
	}
	public String getTen_good() {
		return ten_good;
	}
	public void setTen_good(String ten_good) {
		this.ten_good = ten_good;
	}
	public long getDon_gia() {
		return don_gia;
	}
	public void setDon_gia(long don_gia) {
		this.don_gia = don_gia;
	}
	@Override
	public String toString() {
		return "Good [ma_good=" + ma_good + ", ten_good=" + ten_good
				+ ", don_gia=" + don_gia + ", thoiGian=" + thoiGian + "]";
	}
	
	
}
