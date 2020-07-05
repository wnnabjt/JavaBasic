package cn.itcast.day04.demo02;

public class Demo01MethodSame {

    public static boolean isSame(int a, int b) {
        return a == b;
    }

    public static void main(String[] args) {
        System.out.println(isSame(1, (int)1.5F));
    }
}
