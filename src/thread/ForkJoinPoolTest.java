package thread;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolTest {

    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }


        new Thread(() -> System.out.println(Arrays.stream(array).max().orElse(0) + " my max")).start();
        new Thread(() -> findMax(array)).start();
    }

    private static void findMax(int[] array) {
        RecursiveTask<Integer> recursiveTask = new FindMax(0, array.length, array);

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.invoke(recursiveTask));
    }
}

class FindMax extends RecursiveTask<Integer> {

    int left;
    int right;
    int[] array;

    public FindMax(int left, int right, int[] array) {
        this.left = left;
        this.right = right;
        this.array = array;
    }

    @Override
    protected Integer compute() {
        if (right - left < 1000) {
            int curMax = 0;
            for (int i = left; i < right; i++) {
                curMax = Math.max(curMax, array[i]);
            }
            return curMax;
        } else {
            int mid = left + (right - left) / 2;
            RecursiveTask<Integer> leftRecursive = new FindMax(left, mid, array);
            RecursiveTask<Integer> rightRecursive = new FindMax(mid, right, array);

            leftRecursive.fork();
            rightRecursive.fork();

            return Math.max(leftRecursive.join(), rightRecursive.join());
        }
    }
}
