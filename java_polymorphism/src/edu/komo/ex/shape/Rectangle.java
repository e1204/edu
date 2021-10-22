package edu.komo.ex.shape;

public class Rectangle extends Shape {

	private int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {      // Circle이랑 맞추기 위해 double로 하기, 함수명도 getArea로 같게
		return width * height;
	}
	
	
		
		
		
		
		


}
