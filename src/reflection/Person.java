package reflection;

import java.util.Random;

public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String n1, String n2) {
        boolean random = new Random().nextBoolean();
        name = random ? n1 : n2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person" + " name = '" + name + '\'';
    }
}
