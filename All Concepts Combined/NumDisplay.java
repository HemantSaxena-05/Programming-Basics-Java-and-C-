class MyThread extends Thread {
	
	private String threadName;
	
	MyThread(String name) {
		threadName = name;
	}
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(threadName + " : " + i);
			
			Thread.yield();
		}
	}
}

public class NumDisplay {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("Thread-1");
		MyThread t2 = new MyThread("Thread-2");
		MyThread t3 = new MyThread("Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
