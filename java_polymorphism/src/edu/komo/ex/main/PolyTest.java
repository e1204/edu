package edu.komo.ex.main;

class Bird{
	public void fly() {
		System.out.println("새는 날아댕깁니다.");
	}
}

class Sparow extends Bird{
	public void fly() {
		System.out.println("한 번에 100미터만 날아 댕깁니다.");
	}
}

class Pizone extends Bird{
	public void fly() {
		System.out.println("한 번에 2000미터만 날아 댕깁니다.");
	}
}

class RubBird extends Bird{
	public void fly() {
		System.out.println("날지 못합니다.");
	}
}

public class PolyTest {

	public static void main(String[] args) {
		
		//case1
		Bird bird = new Bird();           
		bird.fly();
		
		bird = new Sparow();
		bird.fly();
		
		//case2 (실무에서 쓰임)
		Bird[] arrBir = {new Bird(), new Sparow(), new Pizone()};  
		
		for (Bird bird2 : arrBir) {
			bird2.fly();
		}
		
		//상속 없을 때
		Sparow sparow = new Sparow();   
		sparow.fly();
		
	}

}
