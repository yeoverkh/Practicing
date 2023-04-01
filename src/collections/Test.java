package collections;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Collection<Integer> digits = List.of(1, 5, -33, 0);

        Collection<Integer> sorted = digits.stream().sorted().toList();

        Collection<Integer> descending = digits.stream().sorted((int1, int2) -> int2.compareTo(int1)).toList();

        System.out.println(digits);
        System.out.println(sorted);
        System.out.println(descending);
    }
}
