package strategy;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new MergeSort());
        sorter.sort();
    }
}
