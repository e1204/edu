package edu.komo.ex.main;

class Bird{
	public void fly() {
		System.out.println("���� ���ƴ��ϴ�.");
	}
}

class Sparow extends Bird{
	public void fly() {
		System.out.println("�� ���� 100���͸� ���� ���ϴ�.");
	}
}

class Pizone extends Bird{
	public void fly() {
		System.out.println("�� ���� 2000���͸� ���� ���ϴ�.");
	}
}

class RubBird extends Bird{
	public void fly() {
		System.out.println("���� ���մϴ�.");
	}
}

public class PolyTest {

	public static void main(String[] args) {
		
		//case1
		Bird bird = new Bird();           
		bird.fly();
		
		bird = new Sparow();
		bird.fly();
		
		//case2 (�ǹ����� ����)
		Bird[] arrBir = {new Bird(), new Sparow(), new Pizone()};  
		
		for (Bird bird2 : arrBir) {
			bird2.fly();
		}
		
		//��� ���� ��
		Sparow sparow = new Sparow();   
		sparow.fly();
		
	}

}
