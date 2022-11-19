package Exercises;

import java.util.HashMap;
import java.util.Map;

public class HasTriples {
    public static void main(String[] args) {
        System.out.println(hasTriples(new int[] {1, 1, 2, 12, 2, 2}));
    }

    public static boolean hasTriples(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int current : nums) {
            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }
        return map.containsValue(3);
    }
}
