import java.util.Scanner;

class Count{
	
	private String word;
	private int consonant;  //����
	private int vowel;      //����
	
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
		
		System.out.println("�� ���ڼ��� " + word.length());
		System.out.println("���� ������ " + vowel);
		System.out.println("���� ������ " + consonant);
		
	}
	
}



public class Test {

	public static void main(String[] args) {
		
		while(true) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		Count cons = new Count(word);
		
		cons.countResult();
		
		//System.out.println("��� Y :: �ߴ� N");
		System.out.println("��� YES :: �ߴ� NO");
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
		
		System.out.println("����");
		
	}

}
