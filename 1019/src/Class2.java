import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		
		int money;
		
		while(true) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ�");
		
		money = sc.nextInt();
		
			System.out.println("������ : " + money / 50000 + "��");
			money = money % 50000;
			System.out.println("���� : " + money / 10000 + "��");
			money = money % 10000;
			System.out.println("��õ�� : " + money / 5000 + "��");
			money = money % 5000;
			System.out.println("õ�� : " + money / 10000 + "��");
			money = money % 10000;
			System.out.println("����� : " + money / 500 + "��");
			money = money % 500;
			System.out.println("��� : " + money / 100 + "��");
			money = money % 100;
			
			System.out.println("��� �Ͻðڽ��ϱ�? Y or N");
			
			char ch = sc.next().charAt(0);
			
			if(ch == 'n' || ch == 'N')
				break;
		
		}
		
		
		
		
}
	
		

	}


