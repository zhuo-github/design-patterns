package builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Laptop implements Computer {
    List<String> list = new ArrayList<>();

    @Override
    public void add(String event) {
        list.add("笔记本电脑：" + event);
    }

    @Override
    public void print() {
        System.out.println(list.toString());
    }
}
