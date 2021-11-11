import javax.swing.JOptionPane;

class ThreadMusic extends Thread{
	
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("+");
		}
	}	
}

class ThreadVedio extends Thread{
	
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
	}	
}

class ThreadCount extends Thread{
	
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
	
}


public class MusicVideoPlayerTest {

	public static void main(String[] args) {
		
		ThreadMusic threadMusic = new ThreadMusic();
		ThreadVedio threadVedio = new ThreadVedio();
		
		//threadMusic.start();
		//threadVedio.start();
		
		ThreadCount threadCount = new ThreadCount();
		threadCount.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		
	}

}
