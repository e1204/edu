import java.util.Scanner;

public class IloveYou {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		String input = sc.nextLine();
		
		for(int i = 0; i <= input.length(); i++) {
			System.out.print(input.substring(i));
			System.out.println(input.substring(0, i));
		}

	}

}
