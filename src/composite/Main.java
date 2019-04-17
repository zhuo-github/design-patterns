package composite;

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("根文件夹");
        Composite dir1 = new Composite("一级文件夹1");
        Composite dir2 = new Composite("一级文件夹2");
        Leaf file1 = new Leaf("1");
        Composite dir11 = new Composite("二级文件夹11");
        Composite dir21 = new Composite("二级文件夹21");
        Composite dir22 = new Composite("二级文件夹22");
        Composite dir23 = new Composite("二级文件夹23");
        Leaf file11 = new Leaf("11");
        Leaf file12 = new Leaf("12");
        Leaf file21 = new Leaf("21");
        root.addChildComponent(dir1);
        root.addChildComponent(dir2);
        root.addChildComponent(file1);
        dir1.addChildComponent(dir11);
        dir1.addChildComponent(file11);
        dir1.addChildComponent(file12);
        dir2.addChildComponent(dir21);
        dir2.addChildComponent(dir22);
        dir2.addChildComponent(dir23);
        dir2.addChildComponent(file21);
        System.out.println(root);
    }
}
