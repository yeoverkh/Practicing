package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        Person p1 = new Person(1, "Max");
        Person p2 = new Person(2, "Chloe");
        Person p3 = new Person(3, "Alex");
        Person p4 = new Person(4, "Rachel");

        Person[] people = {p1, p2, p3, p4};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            oos.writeObject(people);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
