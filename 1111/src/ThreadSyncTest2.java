/*
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Account {

	int balance = 200;

	public void withdraw(int money) {

		if (balance >= money) {
			String threadName = Thread.currentThread().getName(); // 쓰레드 이름 받아오기
			try {
				System.out.println(threadName + "::슬립전:" + balance);
				Thread.sleep(1000);

			} catch (Exception e) {

			}
			System.out.println(threadName + "::빼기전:" + balance);
			balance -= money;
			System.out.println(threadName + "::빼기후:" + balance);
		}

	} // withdraw
}

class A implements Runnable {

	Account acc = new Account();

	public void run() {
		String threadName = Thread.currentThread().getName(); // 쓰레드 이름 받아오기

		System.out.println(threadName + "::balance:" + acc.balance);

		while (acc.balance > 0) {

			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)

			int money = 200;// (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println(threadName + "::balance:" + acc.balance);

		}

	} // run()
}

public class ThreadSyncTest2 {
	public static void main(String[] args) {
		Runnable r = new A();

		Thread t1 = new Thread(r, "첫번째");
		Thread t2 = new Thread(r, "두번째");

		t1.start();
		t2.start();

	}
}*/