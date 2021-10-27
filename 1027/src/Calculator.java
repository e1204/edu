import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
		try {
			System.out.println("*** 계산기 ***");
			System.out.print("수1 :\s");
			int n1 = sc.nextInt();
			System.out.print("수2 :\s");
			int n2 = sc.nextInt();
			System.out.print("연산 :\s");
			String n3 = sc.next();
			if(n3.equals("+"))
				System.out.println(n1 + n2);
			else if(n3.equals("-"))
				System.out.println(n1 - n2);
			else if(n3.equals("*"))
				System.out.println(n1 * n2);
			else if(n3.equals("/"))
				System.out.println(n1 / n2);
				
			System.out.println("계속 하시겠습니까? 계속 : Y , 종료 : N");
			String n4 = sc.next();
			
			if(n4.equals("Y") || n4.equals("y"))
				continue;
			else if(n4.equals("N") || n4.equals("n"))
				System.out.println("종료입니다");
				break;
			
		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 다시입력해 주세요");
		}
		
		}

	}

}
