class Account{
	int balance = 200;
	
	public synchronized void withdraw(int money) {
		
		if(balance >= money) {
			String threadName = Thread.currentThread().getName();
			try {
				System.out.println(threadName +  "::������:" + balance);
				Thread.sleep(1000);   //�ݵ�� try~catch�� ��������� //1.�ι�° �����尡 ���
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			threadName = Thread.currentThread().getName();
			System.out.println(threadName + "::������:" + balance);
			
			balance -= money;
			
			threadName = Thread.currentThread().getName();
			System.out.println(threadName + "::������:" + balance);
		}
	}	
}

class AccountThread implements Runnable{

	Account acc = new Account();
	
	@Override
	public void run() {
		
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + "::balance : " + acc.balance);
		
		while(acc.balance > 0) {
			int money = 200;
			acc.withdraw(money);
			
			threadName = Thread.currentThread().getName();
			System.out.println(threadName + "�ܾ� :: " + acc.balance);
		}		
	}	
}


public class Class2 {

	public static void main(String[] args) {
		
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);
		
		Runnable r = new AccountThread();
		
		Thread t1 = new Thread(r,"ù��°");     //Thread �̸� : ù��°
		Thread t2 = new Thread(r,"�ι�°");
		
		t1.start();
		t2.start();
		
	}

}
