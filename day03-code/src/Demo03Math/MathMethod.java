package Demo03Math;

/*
java.util.Math类是一个数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num);
public static double ceil(double num); 向上取整
public static double floor(double num); 向下取整
public static long round(double num); 四舍五入

Math.PI:近似圆周率
 */

public class MathMethod {

    public static void main(String[] args) {
        double num = -123.556;

        System.out.println(Math.abs(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.round(num)); // 返回值为long
        System.out.println(Math.PI);
    }

}
