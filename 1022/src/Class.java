
class Class {

	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product cart �� ���� index 

	void buy(Product p) {
		/*
		 * (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
		 * 1.1 ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ� 
		 * 1.2 ���� ���� ����ϸ� ��ǰ�� ������ ���� ������ ���� 
		 * 1.3 ��ٱ��Ͽ� ������ ������ ��´�.(add�޼��� ȣ��)
		 */
		
			if(money < p.price) {
				System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� �� �� �����ϴ�.");
			}
			else {
				money = money - p.price;
				add(p);
				System.out.println(p);
				return;
			}
			
				
	}
				
	
	void add(Product p) {
		/*
		 * (2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
		 * 1.1. i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ�� 
		 * 1.1.1 ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ�.
		 * 1.1.2 ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�.
		 * 1.1.3 ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�.
		 * 1.2 ������ ��ٱ���(cart)�� �����Ѵ� �׸��� i�� ���� 1 ������Ų��
		 */
			
			for(i = 0; i <= cart.length ; i++) {
			if(i >= cart.length) {
				Product[] temp = new Product[cart.length * 2];
				//������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�. -> arraycopy
				//���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�. -> cart = temp;
				System.arraycopy(cart, 0, temp, 0, i);
				cart = temp;
				cart[i++] = p;
				}
			else
				return;
			}	
		
		//cart[i] = p;
		//i++;
		//cart[i++] = p;
		
		
		
	} // add(Product p)

	void summary() {
		/*
		 * (3)  �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 
		 * 1.1  ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ� 
		 * 1.2  ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�
		 * 1.3  ������ ��� ���� �ݾ�(money) �� ����Ѵ�
		 */
		
		//����Ʈ �̾Ƴ���
		/*for(Product e: cart) {
			
			System.out.println( e );
		}
		 */
		
		
		System.out.println("������ ���� : " );
		System.out.println("����� �ݾ� : " );
		System.out.println("���� �ݾ� : " + money );
		
		
		
		
	} // summary()
}

class Product {
	int price; // ��ǰ�� ����

	Product(int price) {
		this.price = price;
	}

	public static int Tv() {
		return 0;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}