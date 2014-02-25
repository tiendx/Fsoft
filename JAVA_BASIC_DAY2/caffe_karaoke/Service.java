package caffe_karaoke;

import java.util.ArrayList;

public abstract class Service {
	private ArrayList<Good> dsDoAn;
	public Service(ArrayList<Good> dsDoAn) {
		super();
		this.dsDoAn = dsDoAn;
	}
	public ArrayList<Good> getDsDoAn() {
		return dsDoAn;
	}
	public void setDsDoAn(ArrayList<Good> dsDoAn) {
		this.dsDoAn = dsDoAn;
	}
	public void addGood(Good g){
		this.dsDoAn.add(g);
	}
	public void removeGood(Good g){
		this.dsDoAn.remove(g);
	}
	public void inListGood(){
		for(int i=0;i<dsDoAn.size();i++)
			System.out.println(dsDoAn.get(i));
	}
	public abstract long getTotal();
}
