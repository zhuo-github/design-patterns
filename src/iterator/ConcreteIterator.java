package iterator;

public class ConcreteIterator<E> implements Iterator<E> {
    private MyCollection<E> collection;
    private int currentIndex = -1;
    public ConcreteIterator(MyCollection<E> collection) {
        this.collection = collection;
    }
    public E first() {
        return collection.get(0);
    }
    public E next() {
        if (hasNext()) {
            return collection.get(++currentIndex);
        }
        return null;
    }
    public boolean hasNext() {
        if (currentIndex + 1 < collection.size()) {
            return true;
        }
        return false;
    }
    public E getCurrentItem() {
        if (currentIndex < 0) {
            return null;
        }
        return collection.get(currentIndex);
    }
}
