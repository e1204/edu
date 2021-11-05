import java.util.Scanner;
import java.util.StringTokenizer;

class TokensCount{
	
	private String words;
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {

				words = sc.nextLine();

				if (words.equals("그만")) {
					System.out.println("종료합니다.");
					break;
				}

				StringTokenizer tokens = new StringTokenizer(words, " ");

				System.out.println("어절 개수는 " + tokens.countTokens());

			} catch (Exception e) {
				sc.nextLine();
				System.out.println("잘못된 입력입니다. 다시 입력 하세요.");
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
