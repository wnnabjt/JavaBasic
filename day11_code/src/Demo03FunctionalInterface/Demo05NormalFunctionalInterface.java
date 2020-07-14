package Demo03FunctionalInterface;

/*
    常用的函数式接口：
        1.java.util.function.Supplier<T>接口仅包含一个无参的方法：T get()。用来获取一个泛型参数指定类型的对象数据。
            Supplier<T>接口被称为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据。

        2.java.util.function.Consumer<T>接口与Supplier接口相反，他不是生产数据，而是消费(使用)一个数据。
            Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。
            Consumer接口是一个消费型接口，泛型是什么类型，就可以使用accept方法消费什么类型的数据，至于具体怎么消费，需要自定义。
            Consumer接口中包含一个【默认方法】andThen。
                作用：如果需要两个Consumer接口，可以把这两个Consumer接口组合到一起，再对数据进行消费。
                eg：
                    Consumer<String> con1;
                    Consumer<String> con2;
                    String str = "Hello";
                    con1.accept(str);
                    con2.accept(str);
                    【优化上述代码】
                        连接两个Consumer接口，再进行消费。
                        con1.andThen(con2).accept(s);【谁写前面谁先消费】
        3.java.util.function.Predicate<T>接口
            作用：对某种数据类型的数据进行判断，结果返回一个boolean值

            Predicate接口中包含一个抽象方法：
                boolean test(T, t)：用来对指定的数据类型数据进行判断的方法
                    结果：
                        符合条件，返回true
                        不符合条件，返回false

            Predicate中的默认方法：
                and方法：表示并且关系，也可以用来连接两个判断条件。 这个方法也是用&&符号实现的
                or方法：表示或者关系，也可以用来连接两个判断条件。这个方法使用||实现的。
                negate方法：表示非，底层是用"!"实现的。

        4.Function接口
            java.util.function.Function<T, R> 接口用来根据一个类型的数据得到另一个类型的数据。
                前者称为前置条件，后者称为后置条件。
            Function接口中最主要的抽象方法为：R apply(T t)，根据类型T的参数获取类型R的结果。
                使用场景例如：将Integer类型的数据转换为string。

            Function接口中的默认方法：
                1.andThen：用来将两个Function接口组合到一起，类似于Consumer中的andThen方法。
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo05NormalFunctionalInterface {

    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
//        demo04();
//        demo05();
//        demo06();
//        demo07();
//        demo08();
        demo09();
    }

    private static void demo09() {
        String s = "1000000";
        System.out.println(traverseType(s, s1 -> Integer.parseInt(s1)) * 365);
    }

    private static Integer traverseType(String s, Function<String, Integer> func) {
        return func.apply(s);
    }

    private static void demo08() {
        System.out.println(checkString_negate("Hello Python", s -> s.length() > 5));
    }

    private static boolean checkString_negate(String s, Predicate<String> pred) {
        return pred.negate().test(s);
    }

    private static void demo07() {
        String str = "Hello Python";
        System.out.println(checkString1(str, s -> s.length() > 5, s -> s.contains("a")));
    }

    private static boolean checkString1(String s, Predicate<String> pred1, Predicate<String> pred2) {
        return pred1.or(pred2).test(s);
    }

    private static void demo06() {
        //用来判断一个字符串的长度是否大于5并且其中含有字符'a'。
        String str = "Hello Python";
        System.out.println(checkString(str, s -> s.length() > 5, s -> s.contains("a")));
    }

    private static boolean checkString(String s, Predicate<String> pred1, Predicate<String> pred2) {
        return pred1.and(pred2).test(s);
    }

    private static void demo05() {
        System.out.println(checkString("HelloWorld", s -> s.length() > 100));
    }

    private static boolean checkString(String s, Predicate<String> pred) {
        return pred.test(s);
    }

    private static void demo04() {
        demoAndThen("HelloWorld", (s) -> System.out.println(s.toUpperCase()),
                                (s) -> System.out.println(s.toLowerCase()));
    }

    private static void demoAndThen(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(s);
    }

    private static void demo03() {
        printNum("赵丽颖", (name) -> {
            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);
        });
    }

    private static void printNum(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    private static void demo02() {
        int[] arr = {1, 200, 300, 99, 33};
        System.out.println(getMaxNum(() -> {
            int max = arr[0];
            for (int i : arr) {
                if(max < i) {
                    max = i;
                }
            }
            return max;
        }));
    }



    private static void demo01() {
        System.out.println(getString(() -> "胡歌"));
    }

    public static String getString(Supplier<String> supplier) {
        return supplier.get();
    }

    public static int getMaxNum(Supplier<Integer> supplier) {
        return supplier.get();
    }

}
