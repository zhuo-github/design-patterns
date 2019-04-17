package strategy;

/**
 * @author: i_zhuocanhe@cvte.com
 * @description: 排序系统
 * @date: 2019/4/17
 * @since: 1.0
 */
public class Sorter {
    private Sort sort;
    public Sorter(Sort sort) {
        this.sort = sort;
    }
    public void sort() {
        sort.execute();
    }
}
