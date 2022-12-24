package Exercises;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9})));
    }

    private static int[] shuffle(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = rnd.nextInt(0, arr.length - 1);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }
}
