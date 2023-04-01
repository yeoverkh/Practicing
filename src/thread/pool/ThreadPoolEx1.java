package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx1 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            executorService.execute(new MyThread("First"));
            executorService.execute(new MyThread("Second"));
            executorService.execute(new MyThread("Third"));
            executorService.execute(new MyThread("Fourth"));
            executorService.execute(new MyThread("Fifth"));
        }

        executorService.shutdown();
    }
}

class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " - " + i);
        }
    }
}
