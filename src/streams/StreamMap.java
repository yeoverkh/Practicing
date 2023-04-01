package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(2);
        list.add(1);
        List<Integer> integers = list.stream().map(integer -> integer * 2).toList();
        System.out.println(integers);


        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        List<Integer> lengths = stringList.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengths);

        List<String> anotherStrings = stringList;
        anotherStrings = anotherStrings.stream().map(str -> str + str).toList();
        System.out.println(anotherStrings);

        int[] numbers = new int[] {1, 3, 2, 5, 10};
        numbers = Arrays.stream(numbers).map(number -> number * 2).toArray();
        System.out.println(Arrays.toString(numbers));
    }
}
