/*���� ��ħ �Դϴ�. �� love.txt �� ����
 *�ش� ������ �о� �鿩 love2.txt �� ����
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Practice_56 {

	public static void main(String[] args) {

		OutputStream os = null;
		InputStream is = null;

		try {

			os = new FileOutputStream("C:\\Users\\kosmo\\eclipse-workspace\\love.txt");
			String str = "���� ��ħ�Դϴ�.";
			byte[] bs = str.getBytes();
			os.write(bs);
			
			os.flush();

			is = new FileInputStream("C:\\Users\\kosmo\\eclipse-workspace\\love.txt");
			os = new FileOutputStream("C:\\Users\\kosmo\\eclipse-workspace\\love2.txt");

			bs = new byte[10];
			while (true) {
				int count = is.read(bs);
				if (count == -1) {
					break;
				}
				os.write(bs, 0, count);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}

	}

}
