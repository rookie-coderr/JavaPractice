package multithreading;

public class raceCondition {
	
	public static void main(String[] args) {
		
		System.out.println("main thread has started");
		
		bankAccount Account = new bankAccount();
		
		Thread max = new Thread(Account);
		Thread anna = new Thread(Account);
		
		max.setName("max");
		anna.setName("anna");
		
	    max.start();
	    anna.start();
	    
	    try {
			max.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			anna.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println("main thread ended");
		
	}

}


class bankAccount implements Runnable{
	
	private int balance;
	
	public bankAccount() {
		this.balance = 500;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		withdrawMoney(400);
		if(balance<0) {
			System.out.println(Thread.currentThread().getName()+ " Money overdrawn");
		}
	}

	private synchronized void withdrawMoney(int amount) {
		System.out.println(Thread.currentThread().getName()+ " trying to withdraw");
		Object object = new Object();
//		synchronized (object) {
		if(balance<amount) {
			System.out.println(Thread.currentThread().getName()+ " insufficient balance "+ balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+" about to withdraw");
			balance -= amount;
			System.out.println(Thread.currentThread().getName()+ " withdrawn money" + ", balance = " + balance);
		}
//		}
	}
	
	
	
}
