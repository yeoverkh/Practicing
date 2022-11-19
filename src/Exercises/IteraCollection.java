package Exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IteraCollection<T> implements Iterable<T> {

    List<T> list = new ArrayList<T>();

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return list.size() > index;
        }

        @Override
        public T next() {
            return (T) list.get(index++);
        }
    }
}
