package composite;

import java.util.Objects;

public class Leaf implements Component {
    private String name;
    public Leaf(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        Objects.requireNonNull(name, "文件名不能为空");
        this.name = name;
    }
}
