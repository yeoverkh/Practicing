package streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("z", 10);
        map.put("b", 5);
        map.put("a", 6);
        map.put("c", 20);
        map.put("d", 1);
        map.put("e", 7);
        map.put("y", 8);
        map.put("n", 99);
        map.put("g", 50);
        map.put("m", 2);
        map.put("f", 9);

        System.out.println("Unsorted:");
        System.out.println(map);

        Map<String, Integer> result = map.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Sorted:");
        System.out.println(result);

        Map<String, Integer> resultNumbers = map.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(resultNumbers);
    }
}
