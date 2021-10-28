
package com.cybage.multithreading;

public class JAcctTesting {

	public static void main(String[] args) {

		JointAccount jointAccount = new JointAccount(1, "Alien", 9000);
		jointAccount.addAcctName("saien");

		Runnable runnable_1 = () -> jointAccount.withdraw(3000);
		Runnable runnable_2 = () -> jointAccount.withdraw(3000);

		Thread thread_1 = new Thread(runnable_1);
		Thread thread_2 = new Thread(runnable_2);
	
		try {
			thread_1.start();
			thread_1.join();
			System.out.println("Get Balance: " + jointAccount.getBalance());
			thread_2.start();
			thread_2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
