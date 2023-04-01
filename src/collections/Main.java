package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Value> set = new HashSet<>();
        Value v1 = new Value(1, 1f);
        Value v2 = new Value(1, 1f);
        set.add(v1);
        set.add(v2);

        System.out.println(set);
    }
}

class Value {
    int a;
    float b;

    public Value(int a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Value value = (Value) o;

        if (a != value.a) return false;
        return Float.compare(value.b, b) == 0;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + (b != +0.0f ? Float.floatToIntBits(b) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Value" + " a = " + a + ", b = " + b;
    }
}
