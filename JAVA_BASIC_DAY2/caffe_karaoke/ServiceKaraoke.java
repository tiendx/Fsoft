package caffe_karaoke;

import java.util.ArrayList;
import java.util.Iterator;

public class ServiceKaraoke extends Service {
	
	private Room room;
	

	public ServiceKaraoke(ArrayList<Good> dsDoAn, Room room) {
		super(dsDoAn);
		this.room = room;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public ServiceKaraoke(ArrayList<Good> dsDoAn) {
		super(dsDoAn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public long getTotal() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		long tong=0;
		ArrayList<Good> ds = this.getDsDoAn();
		 Iterator<Good> itr =ds.iterator();
	      while(itr.hasNext()) {
	         Good element = (Good) itr.next();
	         tong=tong+element.getDon_gia();
	      }
	      // Tien karaoke
	      float kara=this.room.getKhoangThoiGian()*this.room.getDon_gia();
	      return (long)kara+tong;
	}

}
