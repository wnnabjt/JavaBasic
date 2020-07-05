package base.java.day01.demo03;

/*
所有的引用类型变量，都可以赋值为一个null值。但是代表其中什么都没有。
但是此时不能使用他。除非补上new。
 */

public class Demo2ArrayNull {

    public static void main(String[] args) {
        int[] a = null;
        System.out.println(a);
    }
}
