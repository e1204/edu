import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {

		final int SCORE_COUNT = 6;

		ArrayList<Character> arrList = new ArrayList<>();

		try {

			Scanner sc = new Scanner(System.in);
			System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> ");

			for (int i = 0; i < SCORE_COUNT; i++) {
				char ch = sc.next().charAt(0);
				arrList.add(ch);
			}

			int sum = 0;
			for (int i = 0; i < arrList.size(); i++) {
				char ch = arrList.get(i);
				
				switch(ch) {
				case 'A','a','B','b','C','c','D','d','F','f':
					break;
				default:
					throw new InputMismatchException();
				}

				switch (ch) {
				case 'A', 'a':
					sum = sum + 4;
					break;
				case 'B', 'b':
					sum = sum + 3;
					break;
				case 'C', 'c':
					sum = sum + 2;
					break;
				case 'D', 'd':
					sum = sum + 1;
					break;
				case 'F', 'f':
					sum = sum + 0;
					break;
				default:
					System.out.println("�߸��� �����Դϴ�.");
					throw new InputMismatchException();
				}

			}

			double avg = (double) sum / arrList.size();
			System.out.println(avg);

		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�. ó������ �ٽ� �Է� ���ּ���.");
			main(args);
		}
	}

}
