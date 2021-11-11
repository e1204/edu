class Account{
	int balance = 200;
	
	public synchronized void withdraw(int money) {
		
		if(balance >= money) {
			String threadName = Thread.currentThread().getName();
			try {
				System.out.println(threadName +  "::슬립전:" + balance);
				Thread.sleep(1000);   //반드시 try~catch로 묶어줘야함 //1.두번째 쓰레드가 잠듬
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			threadName = Thread.currentThread().getName();
			System.out.println(threadName + "::빼기전:" + balance);
			
			balance -= money;
			
			threadName = Thread.currentThread().getName();
			System.out.println(threadName + "::빼기후:" + balance);
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
			System.out.println(threadName + "잔액 :: " + acc.balance);
		}		
	}	
}


public class Class2 {

	public static void main(String[] args) {
		
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);
		
		Runnable r = new AccountThread();
		
		Thread t1 = new Thread(r,"첫번째");     //Thread 이름 : 첫번째
		Thread t2 = new Thread(r,"두번째");
		
		t1.start();
		t2.start();
		
	}

}
