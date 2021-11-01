class Circle{
	
	private int x, y, r;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public String toString() {
		return "Circle(" + x + "," + y + ")������" + r;
	}
	
	public boolean equals(Object obj) {
		
		Circle circle = (Circle)obj;
		
		if(this.x == x && this.y == y)
			return true;
		return false;
		
	}
	
	
}




public class CircleT {

	public static void main(String[] args) {
		
		Circle a = new Circle(2, 3, 5); // �߽� (2, 3)�� ������ 5�� ��
        Circle b = new Circle(2, 3, 30); // �߽� (2, 3)�� ������ 30�� ��

        System.out.println("�� a : " + a);
        System.out.println("�� b : " + b);

       if(a.equals(b))
                System.out.println("���� ��");
        else
        System.out.println("���� �ٸ� ��");
		
		

	}

}
