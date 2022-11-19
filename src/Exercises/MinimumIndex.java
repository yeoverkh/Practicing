package Exercises;

import java.util.*;

public class MinimumIndex {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                                                            new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"})));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            if (Arrays.asList(list2).contains(list1[i])) {
                for (int j = 0; j < list2.length; j++) {
                    if (list1[i].equals(list2[j])) {
                        int sum = i + j;
                        if (map.containsKey(sum)) {
                            List<String> item = map.get(sum);
                            item.add(list1[i]);
                        } else {
                            List<String> item = new ArrayList<>();
                            item.add(list1[i]);
                            map.put(sum, item);
                        }
                        break;
                    }
                }
            }
        }
        if (map.isEmpty()) return new String[0];
        Set<Integer> set = map.keySet();
        int min = Collections.min(set);
        return map.get(min).toArray(new String[0]);
    }
}
