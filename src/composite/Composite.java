package composite;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author: i_zhuocanhe@cvte.com
 * @description: 文件夹
 * @date: 2019/4/17
 * @since: 1.0
 */
public class Composite implements Component {

    private Map<String, Component> map = new HashMap<>();
    private String name;
    public Composite(String name) {
        this.name = name;
    }
    /**
     * 添加子文件/文件夹
     */
    public void addChildComponent(Component component) {
        if (!map.containsKey(component.getName())) {
            map.put(component.getName(), component);
            return;
        }
        throw new RuntimeException("存在相同的文件名，添加子文件失败");
    }
    /**
     * 删除子文件/文件夹
     */
    public void removeChildComponent(Component component) {
        if (map.containsValue(component)) {
            map.remove(component.getName());
            return;
        }
        throw new RuntimeException("不是当前文件夹的子文件，无法删除");
    }
    /**
     * 获取名字
     */
    public String getName() {
        return name;
    }
    /**
     * 改名
     */
    public void setName(String name) {
        Objects.requireNonNull(name, "文件名不能为空");
        this.name = name;
    }
}
