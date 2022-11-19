package Exercises;

public class NoTriples {
    public static void main(String[] args) {
        System.out.println(noTriples(new int[] {1, 1, 1, 2, 2, 1}));
    }

    public static boolean noTriples(int[] nums) {
        int value = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == value) {
                if (count == 2) return false;
                count++;
            } else {
                count = 1;
                value = nums[i];
            }
        }
        return true;
    }
}
