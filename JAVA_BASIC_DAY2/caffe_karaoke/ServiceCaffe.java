package caffe_karaoke;

import java.util.ArrayList;
import java.util.Iterator;

public class ServiceCaffe extends Service {

	private Table ban;
	
	public ServiceCaffe(ArrayList<Good> dsDoAn, Table ban) {
		super(dsDoAn);
		this.ban = ban;
	}
	public Table getBan() {
		return ban;
	}
	public void setBan(Table ban) {
		this.ban = ban;
	}
	public ServiceCaffe(ArrayList<Good> dsDoAn) {
		super(dsDoAn);
		// TODO Auto-generated constructor stub
	}
	@Override
	public long getTotal() {
		// TODO Auto-generated method stub
		long tong=0;
		ArrayList<Good> ds = this.getDsDoAn();
		 Iterator<Good> itr =ds.iterator();
	      while(itr.hasNext()) {
	         Good element = (Good) itr.next();
	         tong=tong+element.getDon_gia();
	      }
	   return tong;
	}

}
