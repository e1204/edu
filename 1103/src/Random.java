import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("**************");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 종료");
		System.out.println("**************");
		
		int start = sc.nextInt();
		
		
			if(start == 1) {
				System.out.println("게임시작");
			}
			else {
				System.out.println("끝");
				break;
			}
			
			int ran = 0;
			int num = (int)(Math.random()*100) + 1;
			
			//System.out.println("게임시작");
			System.out.println(">>>");
			
			ran = sc.nextInt();
			
			for(int i = 0; i < 10; i++) {
				if(num > ran) {
					System.out.println("up");
					ran = sc.nextInt();
				}
				else if(num < ran) {
					System.out.println("down");
					ran = sc.nextInt();
				}	
				else {
					System.out.println("맞았다");
					break;
				}
		
			}
			
		}
	}
		
}
