package caffe_karaoke;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {

		// Khoi tao danh sach good
		Good g1 = new Good("ma_good1", "Caffe", 15000);
		Good g2 = new Good("ma_good2", "Huong Duong", 5000);
		Good g3 = new Good("ma_goood2", "Co ca co la", 10000);
		Good g4 = new Good("ma_good3", "Beer", 10000);
		Good g5 = new Good("ma_good4", "Dia xoai", 20000);
		Good g6 = new Good("ma_good5", "Bim bim", 5000);

		// Khoi tao danh sach Table
		Table tb1 = new Table("b1", "Ban 1", 4);
		Table tb2 = new Table("b2", "Ban 2", 3);
		Table tb3 = new Table("b3", "Ban 3", 2);
		Table tb4 = new Table("b4", "Ban 4", 2);
		Table tb5 = new Table("b5", "Ban 5", 4);
		Table tb6 = new Table("b6", "Ban 6", 10);

		// Khoi tao danh sach ban
		ArrayList<Table> listTable = new ArrayList<Table>();

		listTable.add(tb1);
		listTable.add(tb2);
		listTable.add(tb3);
		listTable.add(tb4);
		listTable.add(tb5);
		listTable.add(tb6);

		// Khoi tao danh sach room
		ArrayList<Room> listRoom = new ArrayList<Room>();
		Room room1 = new Room("P1", "Phong 1", 4, 200000);
		Room room2 = new Room("P2", "Phong 2", 20, 500000);
		Room room3 = new Room("P3", "Phong 3", 10, 300000);
		Room room4 = new Room("P4", "Phong 4", 6, 250000);
		listRoom.add(room1);
		listRoom.add(room2);
		listRoom.add(room3);
		listRoom.add(room4);

		ArrayList<Good> listGood1 = new ArrayList<Good>();
		listGood1.add(g1);
		listGood1.add(g2);
		listGood1.add(g3);
		listGood1.add(g4);
		listGood1.add(g5);
		listGood1.add(g6);

		ArrayList<Good> listGood2 = new ArrayList<Good>();
		listGood2.add(g1);
		listGood2.add(g2);
		listGood2.add(g3);
		listGood2.add(g4);

		ArrayList<ServiceCaffe> listHoaDonCaffe = new ArrayList<ServiceCaffe>();

		ServiceCaffe hoaDonCaffe1 = new ServiceCaffe(listGood1, tb1);
		ServiceCaffe hoaDonCaffe2 = new ServiceCaffe(listGood2, tb2);

		listHoaDonCaffe.add(hoaDonCaffe1);
		listHoaDonCaffe.add(hoaDonCaffe2);

		ArrayList<ServiceKaraoke> listHoaDonKaraoke = new ArrayList<ServiceKaraoke>();

		room1.setThoi_gian_vao(new DateService(10, 4, 20, 1, 2014));
		room1.setThoi_gian_ra(new DateService(10, 6, 20, 1, 2014));
		ServiceKaraoke hoaDonKara1 = new ServiceKaraoke(listGood2, room1);
		listHoaDonKaraoke.add(hoaDonKara1);

		int exit = 1, luachon = 0;
		System.out
				.println("Lua chon:\n0:Tong hoa don caffe\n1: Tong hoa don karaoke\n2: Exit");
		Scanner nhap = new Scanner(System.in);
		while (exit != 0) {
			System.out.println("Vao lua chon:");
			luachon = nhap.nextInt();
			switch (luachon) {
			case 0:
				long tongCaffe = 0;
				for (int i = 0; i < listHoaDonCaffe.size(); i++) {
					System.out.println("Hoa don " + i);
					tongCaffe = tongCaffe + listHoaDonCaffe.get(i).getTotal();
					listHoaDonCaffe.get(i).inListGood();
					System.out.println("-----");
				}
				System.out.println("Tong:" + tongCaffe);
				break;
			case 1:
				long tongKara = 0;
				for (int i = 0; i < listHoaDonKaraoke.size(); i++) {
					ServiceKaraoke kara = listHoaDonKaraoke.get(i);
					Room r = kara.getRoom();
					System.out.println("Hoa don " + i + " (Room:"
							+ r.getTen_phong() + ")");
					tongKara = tongKara + listHoaDonKaraoke.get(i).getTotal();
					kara.inListGood();
					System.out.println("Khoang Thoi gian:"
							+ r.getKhoangThoiGian() + ", Don gia:"
							+ r.getDon_gia());

					System.out.println("-----");
				}
				System.out.println("Tong:" + tongKara);
				break;
			case 2:
				exit = 0;
				break;
			}

		}
	}
}
