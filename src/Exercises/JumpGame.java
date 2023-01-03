package Exercises;

import java.util.Arrays;

public class JumpGame {

    public static void main(String[] args) {

        System.out.println(canJump(new int[] {1,1,2,2,0,1,1}));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;
        int max = 0;
        for (int i = 0; i <= max && i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
        }
        return max >= nums.length - 1;
    }
}
