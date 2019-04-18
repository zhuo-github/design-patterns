package iterator;

import java.util.ArrayList;
import java.util.List;

public class MyList<E> implements MyCollection<E> {
    private List<E> list = new ArrayList<>();
    public void add(E e) {
        list.add(e);
    }
    public int size() {
        return list.size();
    }
    public Iterator<E> iterator() {
        return new ConcreteIterator<>(this);
    }
    public E get(int index) {
        return list.get(index);
    }
}
