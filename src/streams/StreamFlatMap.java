package streams;

import java.util.stream.Stream;

public class StreamFlatMap {

    public static void main(String[] args) {

        String[][][] array = new String[][][]{
                {{"a", "b"}, {"c", "d"}},
                {{"e", "f"}, {"g", "h"}},
                {{"i", "j"}, {"k", "l"}}};


        String[] result = Stream.of(array)  // Stream<String[][]>
                .flatMap(Stream::of) // Stream<String[]>
                .flatMap(Stream::of) // Stream<String>
                .filter(str -> !str.equals("a"))
                .toArray(String[]::new);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
