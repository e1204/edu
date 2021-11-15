import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.lang.model.util.ElementScanner6;

class CountryMap {

	private HashMap<String, Integer> map;

	public CountryMap() {
		map = new HashMap<>();
	}

	public HashMap<String, Integer> getMap() {

		try {
			System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
			Scanner sc = new Scanner(System.in);

			int population = 0;
			String country = " ";

			while (true) {
				System.out.print("���� �̸�, �α� >> ");
				country = sc.next();

				if (country.equals("�׸�")) // �Է� "�׸�" �ϸ� �Է� ����
					break;

				population = sc.nextInt();
				map.put(country, population);
			}

		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			getMap();
		}

		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}

	public void search() {

		try {
			// Ű �Է¹޾Ƽ� �˻��ؼ� ���� ����ϱ� �׸��Ҷ�����
			// ������ �����ϴ� ���
			Scanner sc = new Scanner(System.in);

			String key = " ";
			while (true) {
				System.out.print("�α� �˻� >> ");
				key = sc.next();

				if (key.equals("�׸�")) // �Է� "�׸�" �ϸ� �˻� ����
					break;
				else if (!map.containsKey(key)) { // map�� key�� key�� ���� ������
					System.out.println(key + " ����� �����ϴ�.");
					continue;
				}
				System.out.println(key + " " + map.get(key)); // Ű������ ���� ���
			}

		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			getMap();
		}

	}

	// country.bin �� HashMap<String, Integer> map; �ȿ� ����� ����� �α����� ����
	// I/O Stream ���

	private static final String FILE_NAME = "country.bin";

	public boolean saveFileMap() {

		boolean isDone = true;

		OutputStream os = null;
		DataOutputStream dos = null;

		try {
			os = new FileOutputStream(FILE_NAME);
			dos = new DataOutputStream(os);

			Set<String> set = map.keySet();

			for (String key : set) {
				String country = key;
				int population = map.get(key);

				dos.writeUTF(country);
				dos.writeInt(population);
			}
		} catch (Exception e) {
			e.printStackTrace();
			isDone = false;
		} finally {
			try {
				if (os != null) {
					os.close();
				}
				if (dos != null) {
					dos.close();
				}
			} catch (Exception e2) {

			}
		}

		return isDone;

	}

	// I/O Stream ���
	// ����� country.bin �� �о� �鿩, HashMap<String, Integer> ���� ��ȯ
	public HashMap<String, Integer> readFileMap() {

		HashMap<String, Integer> countryMap = new HashMap<>();
		
		InputStream is = null;
		DataInputStream dis = null;
		
		try {
			
			is = new FileInputStream(FILE_NAME);
			dis = new DataInputStream(is);
			
			while(dis.available() > 0) {  //available() : ������ �о��� ���о���
				String country = dis.readUTF();
				int population = dis.readInt();
			
				countryMap.put(country, population);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {
					is.close();
				}
				if(dis != null) {
					dis.close();
				}
			} catch (Exception e2) {
				
			}
			
		}
		
		return countryMap;
	
	}

	// I/O Stream ���
	// ����� country.bin �� �о� �鿩, ����� ����� �α����� ���
	public void printFileMap() {
		
		InputStream is = null;
		DataInputStream dis = null;
		
		try {
			
			is = new FileInputStream(FILE_NAME);
			dis = new DataInputStream(is);
			
			while(dis.available() > 0) {  //available() : ���� ���� üũ, ������ �о��� ���о���
				String country = dis.readUTF();
				int population = dis.readInt();
				
				System.out.println("���� " + country + ", �α� " + population);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(is != null) {
					is.close();
				}
				if(dis != null) {
					dis.close();
				}
			} catch (Exception e2) {
				
			}
			
		}
		
	}

}

public class ContryMapTest {

	public static void main(String[] args) {
		
		/*
		CountryMap countryMap = new CountryMap();
		countryMap.getMap();

		System.out.println();
		countryMap.search();
		*/
		
		CountryMap map = new CountryMap();
		
		map.getMap();  //�Է�
		map.saveFileMap();  //�Է¹����� ���Ϸ� ����
		
		System.out.println("===========");
		
		map.readFileMap();
		map.printFileMap();

	}

}
