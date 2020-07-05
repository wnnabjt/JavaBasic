package base.java.day01.demo04;

/*
方法的重载(OverLoad)：多个方法的名称一样，但是参数列表不同。
好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能。

方法重载与下列因素相关：
    1.参数类型不同
    2.参数个数不同
    3.参数多类型顺序不同
与下列因素无法：
    1.与方法的返回值无关
    2.与方法名称无关
    因为上述两种存在调用歧义
 */

public class Demo04MethodOverload {

    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(double a, int b) {//多类型顺序不同
        return (int) (a + b);
    }

    public static int add(int a, double b) {
        return (int) (a + b);
    }
}
