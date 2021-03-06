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
		System.out.print("두 정수와 연산자를 입력하시오. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();  //연산자
		
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
			System.out.println("잘못된 연산자입니다.");
			break;
		}
		
		cal.setValue(a, b);
		System.out.println(cal.calculate());
		
	}

}
