/*
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Account {

	int balance = 200;

	public void withdraw(int money) {

		if (balance >= money) {
			String threadName = Thread.currentThread().getName(); // ������ �̸� �޾ƿ���
			try {
				System.out.println(threadName + "::������:" + balance);
				Thread.sleep(1000);

			} catch (Exception e) {

			}
			System.out.println(threadName + "::������:" + balance);
			balance -= money;
			System.out.println(threadName + "::������:" + balance);
		}

	} // withdraw
}

class A implements Runnable {

	Account acc = new Account();

	public void run() {
		String threadName = Thread.currentThread().getName(); // ������ �̸� �޾ƿ���

		System.out.println(threadName + "::balance:" + acc.balance);

		while (acc.balance > 0) {

			// 100, 200, 300���� �� ���� ������ �����ؼ� ���(withdraw)

			int money = 200;// (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println(threadName + "::balance:" + acc.balance);

		}

	} // run()
}

public class ThreadSyncTest2 {
	public static void main(String[] args) {
		Runnable r = new A();

		Thread t1 = new Thread(r, "ù��°");
		Thread t2 = new Thread(r, "�ι�°");

		t1.start();
		t2.start();

	}
}*/