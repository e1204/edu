import java.util.Scanner;
import java.util.StringTokenizer;

class TokensCount{
	
	private String words;
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {

				words = sc.nextLine();

				if (words.equals("�׸�")) {
					System.out.println("�����մϴ�.");
					break;
				}

				StringTokenizer tokens = new StringTokenizer(words, " ");

				System.out.println("���� ������ " + tokens.countTokens());

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է� �ϼ���.");
			}
		}
	}
	
}


public class WordCount {

	public static void main(String[] args) {
		
		TokensCount tc = new TokensCount();
		tc.run();
		
	}

}
