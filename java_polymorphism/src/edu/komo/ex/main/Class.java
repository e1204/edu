package edu.komo.ex.main;

import edu.komo.ex.shape.Circle;
import edu.komo.ex.shape.Rectangle;
import edu.komo.ex.shape.Shape;
import edu.komo.ex.shape.Triangle;

public class Class {

	public static void main(String[] args) {
		
		//case1
		Circle circle = new Circle(10);
		Rectangle rec = new Rectangle(10, 10);
		
		double totalArea = circle.getArea() + rec.getArea();
		System.out.println(totalArea);
		
		//case2 : Shape Class ���� -> Circle�� Rectangle Ŭ������ extends Shape
		//����� ���Ѱ� �ƴ϶� ������������ �����صΰ� ������
		Shape[] shape = {new Circle(10), new Rectangle(10, 10), new Triangle(10, 10)};
		double sum = 0;
		for (Shape shape2 : shape) {
			sum = sum + shape2.getArea();
		}
		System.out.println(sum);
		
	}

}
