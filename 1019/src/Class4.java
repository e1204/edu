import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		
		int money;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("µ·");
		
		money = sc.nextInt();
		
		int[] mon = new int[6];
		
		mon[0] = 50000;
		mon[1] = 10000;
		mon[2] = 5000;
		mon[3] = 1000;
		mon[4] = 500;
		mon[5] = 100;
		
		for(int i = 0; i < mon.length; i++) {
			System.out.println(mon[i] + "¿ø : " + money/mon[i] + "Àå");
			money = money % mon[i];
		}
		
	

	}

}
