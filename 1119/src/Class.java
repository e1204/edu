import java.util.Scanner;

class Circle{
	
	private int r;
	
	public Circle(int r) {
		this.r= r;
	}
	
	public double getArea() {
		return r * r * Math.PI;
	}	
}


public class Class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("반지름을 입력하세요.");
		
		int r = sc.nextInt();
		
		Circle circle = new Circle(r);
		
		System.out.println(circle.getArea() + "입니다.");
		
	}

}
