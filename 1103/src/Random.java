import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("**************");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ����");
		System.out.println("**************");
		
		int start = sc.nextInt();
		
		
			if(start == 1) {
				System.out.println("���ӽ���");
			}
			else {
				System.out.println("��");
				break;
			}
			
			int ran = 0;
			int num = (int)(Math.random()*100) + 1;
			
			//System.out.println("���ӽ���");
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
					System.out.println("�¾Ҵ�");
					break;
				}
		
			}
			
		}
	}
		
}
