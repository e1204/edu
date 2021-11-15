import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

class IOCopy {

	public static final String FILE_NAME = "love.txt";

	public boolean saveWords(String words) {
		
		boolean isDone = true;

		OutputStream os = null;

		try {

			os = new FileOutputStream(FILE_NAME);
			byte[] buffer = words.getBytes();
			os.write(buffer);

		} catch (Exception e) {
			e.printStackTrace();
			isDone = false;
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (Exception e2) {

			}
		}

		return isDone;

	}

	public boolean copyFile(String src, String des) { // src : source(원본 파일) , des : copy할 대상 파일

		boolean isDone = true;

		OutputStream os = null;
		InputStream is = null;

		try {

			is = new FileInputStream(src);
			
			byte[] buffer = is.readAllBytes();
			
			os = new FileOutputStream(des);
			os.write(buffer);
			
		} catch (Exception e) {
			isDone = false;
			e.printStackTrace();
		} finally {
			try {
				if(os != null) {
					os.close();
				}
				if(is != null) {
					is.close();
				}
			} catch (Exception e2) {
				
			}
		}

		return isDone;

	}

}

public class Practice_56_1 {

	public static void main(String[] args) {
		
		IOCopy ioCopy = new IOCopy();
		
		ioCopy.saveWords("좋은 아침입니다.");
		ioCopy.copyFile("love.txt", "love2.txt");

	}

}
