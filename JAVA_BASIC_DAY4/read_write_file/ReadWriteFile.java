package read_write_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class ReadWriteFile {
	HashMap<String, Integer> hash = new HashMap<String, Integer>();

	public ReadWriteFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReadWriteFile(HashMap<String, Integer> hash) {
		super();
		this.hash = hash;
	}

	// Ghi 1 HashMap vao File
	public boolean writeFile(String fileName) {
		FileOutputStream fop = null;
		File file;
		try {
			file = new File(fileName);
			fop = new FileOutputStream(file);

			if (!file.exists()) {
				file.createNewFile();
			}

			// tien hanh ghi du lieu ra file
			Set<String> set = hash.keySet();
			Iterator<String> ite = set.iterator();
			String str = "";
			while (ite.hasNext()) {
				String s = ite.next();
				str = "Key=" + s + ", Value=" + hash.get(s) + "\n";
				// ghi 1 mang bytes[] vao file
				fop.write(str.getBytes());
			}

			fop.flush();
			fop.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	// Doc 1 file ra HashMap
	public HashMap<String, Integer> ReadFile(String fileName) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		try {
			is = new FileInputStream(fileName);
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String data = "";
			while ((data = br.readLine()) != null) {
				data = data.trim();
				StringTokenizer st = new StringTokenizer(data, ",");
				String str1 = (String) st.nextElement();
				str1 = str1.trim();
				String str2 = (String) st.nextElement();
				str2 = str2.trim();
				try {
					int value = Integer.parseInt(str2);
					hm.put(str1, value);
				} catch (Exception e) {
					System.out.println("Loi convert String -> int");
					return null;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
				if (isr != null)
					isr.close();
				if (br != null)
					br.close();
			} catch (IOException e) {

			}
		}
		return hm;
	}

	public static void main(String[] args) {
		
		// Khoi tao doi tuong ReadWriteFile voi tham so la 1 hashMap
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("TienDX", 150588);
		hm.put("NhungNT", 190391);
		hm.put("DongDT", 150515);
		ReadWriteFile rwf = new ReadWriteFile(hm);
		
		// Ghi hashMap ra file
		if (rwf.writeFile("tiendx.txt")) {
			System.out.println("Ghi du lieu thanh cong !");
		} else {
			System.out.println("Ghi du lieu error !");
		}
		
		// Thuc hien qua trinh doc file vao hashMap
		ReadWriteFile rwl = new ReadWriteFile();
		hm = rwl.ReadFile("tiendx.txt");
		System.out.println(hm);
	}
}
