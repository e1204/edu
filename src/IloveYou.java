import java.util.Scanner;

public class IloveYou {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String input = sc.nextLine();
		
		for(int i = 0; i <= input.length(); i++) {
			System.out.print(input.substring(i));
			System.out.println(input.substring(0, i));
		}

	}

}
