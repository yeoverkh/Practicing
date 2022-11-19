package Exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeReverted(11210));
    }

    public static boolean isPalindromeReverted(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) return false;

        int revertedNumber = 0;
        while (revertedNumber < x) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        LinkedList<Integer> list = new LinkedList<>();
        while (x != 0) {
            int item = x % 10;
            list.add(item);
            x = (x - item) / 10;
        }
        if (list.size() % 2 == 0) {
            while (!list.isEmpty()) {
                if (check(list)) return false;
            }
        } else {
            while (list.size() != 1) {
                if (check(list)) return false;
            }
        }
        return true;
    }

    public static boolean check(LinkedList<Integer> list) {
        if (list.pollFirst() != list.pollLast()) {
            return true;
        }
        return false;
    }
}
