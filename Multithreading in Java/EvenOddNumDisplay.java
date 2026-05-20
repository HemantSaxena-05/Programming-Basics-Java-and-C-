class OnlyNumbers implements Runnable {

    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            Thread.yield();
        }
    }
}

class EvenOddNumDisplay {
    public static void main(String[] args) {

        OnlyNumbers e = new OnlyNumbers();

        Thread t1 = new Thread(e);
        Thread t2 = new Thread(e);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}