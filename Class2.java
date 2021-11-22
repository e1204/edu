class Money{
	
	private int money;
	
	public Money(int money) {
		setMoney(money);
	}
	
	public void setMoney(int money) {
		if(money < 0) {
			this.money = 0;
			System.out.println("잘못된 입력입니다");
			return;
		}
		else {
			this.money = money;
		}
	}
	
	public void show() {
		
		System.out.println("오만원 : " + money/50000);
		money = money % 50000;
		System.out.println("만원 : " + money/10000);
		money = money % 10000;
		System.out.println("오천원 : " + money/5000);
		money = money % 5000;
		System.out.println("천원 : " + money/10000);
		money = money % 10000;
		System.out.println("오백원 : " + money/500);
		money = money % 500;
		System.out.println("백원 : " + money/100);
		money = money % 100;
		}
		
}	

public class Class2 {

	public static void main(String[] args) {

		Money money = new Money(-126000);
		money.show();
		
	}

}
