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
		
		System.out.println("표준체중은 " + mWeight + "입니다.");
		
		if(weight > mWeight)
			System.out.println("당신은 과체중입니다.");
		else if(weight < mWeight)
			System.out.println("당신은 저체중입니다.");
		else
			System.out.println("당신은 표준체중입니다.");
	}
	
}


public class BMITest {

	public static void main(String[] args) {
		
		while(true) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키(cm)를 입력하세요.");
		int height = sc.nextInt();
		
		System.out.println("체중(kg)을 입력하세요.");
		int weight = sc.nextInt();
		
		BMICalculator bmi = new BMICalculator(height, weight);
		bmi.printResult();
		
		System.out.println("계속 Y :: 중단 N");
		
		char ch = sc.next().charAt(0);
		
		if(ch == 'n' || ch == 'N')
			break;
		}
		
		System.out.println("종료");
		
	}

}
