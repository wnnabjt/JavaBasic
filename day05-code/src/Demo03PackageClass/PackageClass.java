package Demo03PackageClass;

/*
包装类：基本数据类型取值非常方便，但是缺少一些使用的方法对其中的值进行操作，因此就产生了包装类。

包装类：里面保存一个基本数据类型，同时还包含有很多对该类型数据进行操作的方法。
eg:
    byte --> Byte
    short --> Short
    int --> Integer
    long --> Long
    float --> Float
    boolean --> Boolean
    double --> Double
    char --> Character

数据的装箱与拆箱：
装箱：把基本类型的数据，包装到其对应的包装类中。
    构造方法：
    Integer(int value)：构造一个Integer类型的对象，他表示指定的int值。
    Integer(String s)：构造一个Integer类型的对象，用它来表示String对象所表示的int值。
    此处String s必须为合法的int值，否则会抛出异常。

    静态方法：
    static Integer valueOf(int i)：返回一个表示指定的int值的Integer对象
    static Integer valueOf(String s)：返回保存指定String值的对象。

拆箱：把在包装类中的数据转换为基本数据类型。
    intValue() 以int类型返回该Integer对象的值。

【JDK1.5之后，JVM支持自动装箱和自动拆箱】


 */

public class PackageClass {

    public static void main(String[] args) {
        int num = 1;
        Integer num1 = new Integer((num));
        System.out.println(num1);
        Integer num2 = new Integer("12");
        System.out.println(num2);

        Integer num3 = Integer.valueOf(1);
        System.out.println(num3);
        Integer num4 = Integer.valueOf("234");
        System.out.println(num4);

        int num5 = num4.intValue();
        System.out.println(num5);
    }

}
