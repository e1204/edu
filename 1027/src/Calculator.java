import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
		try {
			System.out.println("*** ���� ***");
			System.out.print("��1 :\s");
			int n1 = sc.nextInt();
			System.out.print("��2 :\s");
			int n2 = sc.nextInt();
			System.out.print("���� :\s");
			String n3 = sc.next();
			if(n3.equals("+"))
				System.out.println(n1 + n2);
			else if(n3.equals("-"))
				System.out.println(n1 - n2);
			else if(n3.equals("*"))
				System.out.println(n1 * n2);
			else if(n3.equals("/"))
				System.out.println(n1 / n2);
				
			System.out.println("��� �Ͻðڽ��ϱ�? ��� : Y , ���� : N");
			String n4 = sc.next();
			
			if(n4.equals("Y") || n4.equals("y"))
				continue;
			else if(n4.equals("N") || n4.equals("n"))
				System.out.println("�����Դϴ�");
				break;
			
		} catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է��� �ּ���");
		}
		
		}

	}

}
