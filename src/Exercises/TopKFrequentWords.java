package Exercises;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKFrequentWords {
    public static void main(String[] args) {

    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
    }
}
