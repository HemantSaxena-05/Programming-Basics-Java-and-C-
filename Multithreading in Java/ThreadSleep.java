class MyThread extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        t1.start();
    }
}