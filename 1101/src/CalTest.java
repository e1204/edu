import java.util.Scanner;

abstract class Calc{
	
	protected int a;
	protected int b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();
		
}

class Add extends Calc{

	@Override
	int calculate() {
		return super.a + super.b;
	}
	
}

class Sub extends Calc{

	@Override
	int calculate() {
		return super.a - super.b;
	}
	
}

class Mul extends Calc{

	@Override
	int calculate() {
		return super.a * super.b;
	}
	
}

class Div extends Calc{

	@Override
	int calculate() {
		return super.a / super.b;
	}
	
}


public class CalTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();  //������
		
		Calc cal = null;
		
		switch(op) {
		
		case "+" :
			cal = new Add();
			break;
		case "-" :
			cal = new Sub();
			break;
		case "*" :
			cal = new Mul();
			break;
		case "/" :
			cal = new Div();
			break;	
		default :
			System.out.println("�߸��� �������Դϴ�.");
			break;
		}
		
		cal.setValue(a, b);
		System.out.println(cal.calculate());
		
	}

}
