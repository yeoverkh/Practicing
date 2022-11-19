package Exercises;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int length = s.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char ch1 = s.charAt(i);
            System.out.println("char 1: " + ch1);
            if (map.containsKey(ch1)) {
                char ch2 = map.get(ch1);
                System.out.println("char 2: " + ch2);
                if (ch1 == ch2) {
                    return false;
                }
            } else {
                map.put(ch1, t.charAt(i));
            }
        }
        return true;
    }
}
