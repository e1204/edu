import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		
		while(true) {
		
		int[] arr = new int[4];
		
		arr[0] = 500;
		arr[1] = 100;
		arr[2] = 50;
		arr[3] = 10;
		
		int money = (int)(Math.random()*5000 + 1);
		
		System.out.println(money);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "�� : " + money/arr[i] + "��");
			money = money % arr[i];
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� �Ͻðڽ��ϱ�? Y :: N");
		char ch = sc.next().charAt(0);
		if(ch == 'n' || ch == 'N')
			break;
			
		}
		System.out.println("�ߴ�");
	}

}
