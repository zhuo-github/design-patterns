package iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> collection=new MyList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println("当前："+iterator.getCurrentItem());
            System.out.println("下个："+iterator.next());
            System.out.println("----------------------");
        }
        System.out.println("当前："+iterator.getCurrentItem());
        System.out.println(iterator.first());
    }
}
