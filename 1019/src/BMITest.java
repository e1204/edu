import java.util.Scanner;

class BMICalculator{
	
	private double height;
	private double weight;
	
	public BMICalculator(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public void printResult() {
		double mWeight = (height - 100) * 0.9;
		
		System.out.println("ǥ��ü���� " + mWeight + "�Դϴ�.");
		
		if(weight > mWeight)
			System.out.println("����� ��ü���Դϴ�.");
		else if(weight < mWeight)
			System.out.println("����� ��ü���Դϴ�.");
		else
			System.out.println("����� ǥ��ü���Դϴ�.");
	}
	
}


public class BMITest {

	public static void main(String[] args) {
		
		while(true) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű(cm)�� �Է��ϼ���.");
		int height = sc.nextInt();
		
		System.out.println("ü��(kg)�� �Է��ϼ���.");
		int weight = sc.nextInt();
		
		BMICalculator bmi = new BMICalculator(height, weight);
		bmi.printResult();
		
		System.out.println("��� Y :: �ߴ� N");
		
		char ch = sc.next().charAt(0);
		
		if(ch == 'n' || ch == 'N')
			break;
		}
		
		System.out.println("����");
		
	}

}
