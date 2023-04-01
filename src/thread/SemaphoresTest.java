package thread;

import java.util.concurrent.Semaphore;

public class SemaphoresTest {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);
        CheckSemaphore s1 = new CheckSemaphore();
        System.out.println(s1.getName());
        System.out.println(semaphore.getQueueLength());
        CheckSemaphore s2 = new CheckSemaphore();
        CheckSemaphore s3 = new CheckSemaphore();
        CheckSemaphore s4 = new CheckSemaphore();
        CheckSemaphore s5 = new CheckSemaphore();
        s1.semaphore = semaphore;
        s2.semaphore = semaphore;
        s3.semaphore = semaphore;
        s4.semaphore = semaphore;
        s5.semaphore = semaphore;

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
    }

    static class CheckSemaphore extends Thread {

        Semaphore semaphore;

        @Override
        public void run() {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            semaphore.release();
        }
    }
}
