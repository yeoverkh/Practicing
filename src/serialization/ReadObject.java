package serialization;

import java.io.*;
import java.util.Arrays;

public class ReadObject {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {

            Person[] people = (Person[]) ois.readObject();

            Arrays.stream(people).forEach(System.out::println);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
