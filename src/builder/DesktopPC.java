package builder;

import java.util.ArrayList;
import java.util.List;

public class DesktopPC implements Computer{
    List<String> list=new ArrayList<>();

    @Override
    public void add(String event) {
        list.add("台式电脑："+event);
    }
    @Override
    public void print() {
        System.out.println(list.toString());
    }
}
