package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetOneHashCodeTest {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Max");
        Person p2 = new Person(1, "Max");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(set);
    }

    static class Person {

        int id;

        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person" + " id = " + id + ", name = '" + name + '\'';
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }
}
