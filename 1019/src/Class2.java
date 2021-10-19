import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		
		int money;
		
		while(true) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액");
		
		money = sc.nextInt();
		
			System.out.println("오만원 : " + money / 50000 + "장");
			money = money % 50000;
			System.out.println("만원 : " + money / 10000 + "장");
			money = money % 10000;
			System.out.println("오천원 : " + money / 5000 + "장");
			money = money % 5000;
			System.out.println("천원 : " + money / 10000 + "장");
			money = money % 10000;
			System.out.println("오백원 : " + money / 500 + "장");
			money = money % 500;
			System.out.println("백원 : " + money / 100 + "장");
			money = money % 100;
			
			System.out.println("계속 하시겠습니까? Y or N");
			
			char ch = sc.next().charAt(0);
			
			if(ch == 'n' || ch == 'N')
				break;
		
		}
		
		
		
		
}
	
		

	}


