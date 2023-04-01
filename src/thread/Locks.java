package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);

        t1.start();
        t2.start();

        Thread.sleep(1000);

        System.out.println(myThread.getX());
    }
}

class MyThread extends Thread {

    private Lock lock = new ReentrantLock();
    private int x = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            x++;
            lock.unlock();
        }
    }

    public int getX() {
        return x;
    }
}
