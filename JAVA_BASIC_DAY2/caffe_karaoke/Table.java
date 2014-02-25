package caffe_karaoke;
/*
 * Lop chua thong tin ve ban uong caffe
 */
public class Table {
	private String ma_ban;
	private String ten_ban;
	private int loai_ban;
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Table(String ma_ban, String ten_ban, int loai_ban) {
		super();
		this.ma_ban = ma_ban;
		this.ten_ban = ten_ban;
		this.loai_ban = loai_ban;
	}
	public String getMa_ban() {
		return ma_ban;
	}
	public void setMa_ban(String ma_ban) {
		this.ma_ban = ma_ban;
	}
	public String getTen_ban() {
		return ten_ban;
	}
	public void setTen_ban(String ten_ban) {
		this.ten_ban = ten_ban;
	}
	public int getLoai_ban() {
		return loai_ban;
	}
	public void setLoai_ban(int loai_ban) {
		this.loai_ban = loai_ban;
	}
	@Override
	public String toString() {
		return "Table [ma_ban=" + ma_ban + ", ten_ban=" + ten_ban
				+ ", loai_ban=" + loai_ban + "]";
	}
	
	
	
}
