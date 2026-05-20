class SharedData {
    private int number;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        try {
            while (hasData) {
                wait(); 
            }

            number = value;
            System.out.println("Produced: " + number);

            hasData = true;
            notify(); 

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public synchronized void consume() {
        try {
            while (!hasData) {
                wait();
            }

            System.out.println("Consumed: " + number);

            hasData = false;
            notify(); 

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Producer extends Thread {
    SharedData data;

    Producer(SharedData d) {
        data = d;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.produce(i);
        }
    }
}

class Consumer extends Thread {
    SharedData data;

    Consumer(SharedData d) {
        data = d;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            data.consume();
        }
    }
}

public class WaitNotify {
    public static void main(String[] args) {

        SharedData obj = new SharedData();

        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();
    }
}