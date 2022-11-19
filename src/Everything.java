import Interfaces.DefaultImplementation;
import com.sun.jdi.IntegerValue;

import java.util.*;

public class Everything {
    public static void main(String[] args) {
        Comparator<String> c = String::compareTo;
        System.out.println(c.compare("zaab", "abba"));

        int[] ints = {1, 2, 3, 4};
        int integers = Arrays.asList(Arrays.stream(ints).boxed().toArray(Integer[]::new)).indexOf(2);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(4, 5);
        System.out.println(map.getClass().getSimpleName());


        int[] array = new int[] {1, 2, 1, 2};
        something(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        Integer i = 0;
        System.out.println(i);
        int a = i + 1;
        System.out.println(a);
        Integer b = a + a;
        System.out.println(b);
    }

    static void something(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }
        array = new int[5];
    }
}
