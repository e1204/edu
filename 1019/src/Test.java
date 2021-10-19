import java.util.Scanner;

class Count{
	
	private String word;
	private int consonant;  //자음
	private int vowel;      //모음
	
	public Count(String word) {
		this.word = word;
		consonant = 0;
		vowel = 0;
	}
	
	/*private void count(char ch) {
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			vowel++;
			break;
			
		default :
			consonant++;
		
		}
		
	}*/
	
	public void countResult() {
		for(int i = 0; i < word.length(); i++) {
			
			char ch = word.charAt(i);
			//count(ch);
			
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;
				
			default :
				consonant++;
			}
		}
		
		System.out.println("총 글자수는 " + word.length());
		System.out.println("모음 개수는 " + vowel);
		System.out.println("자음 개수는 " + consonant);
		
	}
	
}



public class Test {

	public static void main(String[] args) {
		
		while(true) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		Count cons = new Count(word);
		
		cons.countResult();
		
		//System.out.println("계속 Y :: 중단 N");
		System.out.println("계속 YES :: 중단 NO");
		String YesOrNo = sc.next();
		
		if(YesOrNo.equals("yes") || YesOrNo.equals("YES"))
			continue;
		else
			break;
		
		/*char ch = sc.next().charAt(0);
		
		if(ch == 'N' || ch == 'n')
			break;
		*/
		
		}
		
		System.out.println("종료");
		
	}

}
