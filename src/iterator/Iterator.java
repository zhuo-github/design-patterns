package iterator;

public interface Iterator<E> {
    E first();
    E next();
    boolean hasNext();
    E getCurrentItem();
}
