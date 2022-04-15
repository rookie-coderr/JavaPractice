package multithreading;

public class threads {
	
	public static void main(String[] args) {
		
		Task task = new Task();
		Thread thread =  new Thread(task);
		thread.setName("A1");
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main Thread running");
		System.out.println(Thread.currentThread().getName());
	}
	

}

class Task implements Runnable{

	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Subthread running");
		System.out.println(Thread.currentThread().getName());
		go();
		
	}
    
	public void go() {
		 
		System.out.println(Thread.currentThread().getName());
//		System.out.println();
		
		
	}
	
}
