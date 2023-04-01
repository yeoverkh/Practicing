package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StreamFilterAndReduce {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        stringList.add("six");
        stringList.add("seven");
        stringList.add("eight");
        stringList.add("nine");
        stringList.add("ten");
        String string = stringList.stream().filter(s -> s.length() != 3).reduce("", (result, str) -> result + str);
        System.out.println(string);
    }
}
