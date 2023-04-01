package streams;

import java.util.Arrays;

public class StreamForEach {

    public static void main(String[] args) {
        int[] nums = new int[] {5, 3, 9, 1, 3};
        Arrays.stream(nums).forEach(System.out::println);
    }
}
