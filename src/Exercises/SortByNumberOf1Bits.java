package Exercises;

import java.util.Arrays;

public class SortByNumberOf1Bits {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBits(new int[]{1, 2, 4, 5, 1, 5, 8, 16, 32, 15, 9, 10, 12})));
    }

    public static int[] sortByBits(int[] arr) {
        Integer[] wrapper = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(wrapper, (a, b) -> {
            int count1 = Integer.bitCount(a);
            int count2 = Integer.bitCount(b);
            if (count1 > count2) return 1;
            else if (count1 < count2) return -1;
            else return a.compareTo(b);
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = wrapper[i];
        }
        return arr;
    }
}
