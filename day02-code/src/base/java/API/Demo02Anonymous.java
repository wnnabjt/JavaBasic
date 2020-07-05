package base.java.API;

import java.util.Scanner;

/*
匿名对象：format：new 类名称(参数)

匿名对象只能使用一次。
 */

public class Demo02Anonymous {

    public static void main(String[] args) {
//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);
        //使用匿名对象进行传参
//        methodParam(new Scanner(System.in));
        //使用匿名对象作为返回值
        Scanner sc = methodReturn();
        System.out.println(sc.nextInt());
    }

    public static void methodParam(Scanner sc) {
        System.out.println(sc.nextInt());
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }

}
