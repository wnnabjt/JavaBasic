package Demo04Stream;

/*
    Stream流是JDK1.8之后出现的，他关注的是做什么，而不是怎么做，一般和lambda表达式相结合使用。
    java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。（这并不是一个函数式接口）
    获取一个流非常简单，有以下几种方法：
        所有的Collection集合都可以通过stream默认方法获取流： default Stream<E> stream()
        Stream接口的静态方法of可以获取数组对应的流。  static <T> Stream<T> of (T ... values)
            参数是一个可变参数，那么我们就可以传递一个数组。

    Stream中的方法可被分为两种：
        延迟方法：返回值类型仍然是Stream接口自身类型的方法，因此支持链式调用。（除了终结方法外，其余方法都是延迟方法）。
        终结方法：返回值类型不再是Stream接口自身类型的方法，因此不支持链式操作。 本小节中终结方法包括 count方法和forEach方法。

        void forEach(Consumer<? super T> action);
            该方法接受一个Consumer接口函数，会将每一个流元素交给该函数进行处理。

        Stream<T> filter<Predicate<? super T> predicate);
        filter方法的参数Predicate是一个函数式接口，可以使用lambda表达式，
            Predicate中的抽象方法： boolean test(T t)。



    【注意事项】：Stream流属于管道流，只能被使用一次。
        第一个Stream流调用完毕后，数据就会流转到下一个Stream上，第一个Stream流就会关闭，因此使用过的Stream流就不能调用方法了。

 */

import java.util.*;
import java.util.stream.Stream;

public class Demo01Stream {

    public static void main(String[] args) {
//        demo01();//需求：遍历一个集合，并对集合中的元素进行过滤。
//        demo02();//获取流的例子

    }

    private static void demo02() {
        List <String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map = new HashMap<>();
        Stream<String> stream3 = map.keySet().stream();
        Stream<String> stream4 = map.values().stream();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);

        Stream<Integer> integerStream1 = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});

        Stream<String> stringStream = Stream.of(new String[]{"a", "b", "c"});


    }

    private static void demo01() {

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("周芷若");
        list.add("赵铭");
        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("赵日天");
        list.stream().filter(name -> name.startsWith("赵"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }

}
