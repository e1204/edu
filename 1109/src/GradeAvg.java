import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {

		final int SCORE_COUNT = 6;

		ArrayList<Character> arrList = new ArrayList<>();

		try {

			Scanner sc = new Scanner(System.in);
			System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");

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
					System.out.println("잘못된 점수입니다.");
					throw new InputMismatchException();
				}

			}

			double avg = (double) sum / arrList.size();
			System.out.println(avg);

		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 처음부터 다시 입력 해주세요.");
			main(args);
		}
	}

}
