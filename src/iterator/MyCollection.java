package iterator;

public interface MyCollection<E> {
    Iterator<E> iterator();
    E get(int index);
    void add(E e);
    int size();
}
