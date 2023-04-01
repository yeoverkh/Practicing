package collections.variants;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Orange> oranges = new ArrayList<>();

        List<Fruit> fruits = new ArrayList<>();

        List<Citrus> citruses = new ArrayList<>();

        List<BigOrange> bigOranges = List.of(new BigOrange(5), new BigOrange(2));

        add10Oranges(fruits);
        add10Oranges(citruses);
        add10Oranges(oranges);
//        add10Oranges(bigOranges);

//        System.out.println(countOranges(fruits));
//        System.out.println(countOranges(citruses));
        showOranges(oranges);
        showOranges(bigOranges);
    }

    private static void showOranges(List<? extends Orange> oranges) {
        for (Orange orange : oranges) {
            System.out.println(orange.getSize());
        }
    }

    static void add10Oranges(List<? super Orange> oranges) {
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange(0));
        }
    }
}

class Fruit {
}

class Citrus extends Fruit {

}

class Orange extends Citrus {

    int size;

    public Orange(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

class BigOrange extends Orange {

    public BigOrange(int size) {
        super(size);
    }
}

class Juice {

    double volume;
    String name;

    public Juice(double volume, String name) {
        this.volume = volume;
        this.name = name;
    }
}
