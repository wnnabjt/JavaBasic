package Demo01MethodQuote;

/*
    下面我们使用lambda表达式实现一个功能，打印一个数据。

    方法引用，::双冒号为引用运算法。

    如果lambda表达式要表达的函数方案已经存在于某个方法的实现中，那么可以用双冒号来引用该方法作为lambda的替代者。

    例如：在本例中，System.out对象中有重载的println()，可以打印任何类型的数据，这刚好就是我们所需要的。
    那么对于print函数的接口参数来说，有下面两种写法。

    Lambda表达式： s -> System.out.println(s);
    方法引用写法 System.out::println；

    lambda表达式的语义是：拿到一个参数s，经过lambda之手，传递给里面的System.out.println方法来处理。
    方法引用的语义：直接让System.out中的方法println取代lambda。

    【注意】：lambda中传递的参数一定是方法引用中那个方法可以接收的类型，否则会抛出异常。
 */

public class Demo01LambdaSimplify {

    public static void main(String[] args) {
        demo01();//lambda表达式
        demo02();//方法引用
    }

    private static void demo02() {
        String str = "Whosyourdaddy";
        Long longNum = 100000000000000000L;
        print(str, System.out::println);
        print(longNum, System.out::println);
    }

    private static void demo01() {
        String str = "Whosyourdaddy";
        Long longNum = 100000000000000000L;
        print(str, s -> System.out.println(s));
        print(longNum, num -> System.out.println(num));
    }

    public static <T> void print(T s, printable<T> p) {
        p.print(s);
    }

}
