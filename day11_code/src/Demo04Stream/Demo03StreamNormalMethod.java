package Demo04Stream;

/*
    Stream流中的常用方法：
        Long count(); 返回流中元素的个数。
            count方法是一个终结方法，返回值是一个long类型的整数。

        limit方法：用于截取流中的元素，只取前n个
        Stream<T> limit(long maxSize);
            参数类型是一个long型，如果集合当前长度大于参数则进行截取，否则不进行操作。

        skip方法:用于跳过流中前面的n个元素
        Stream<T> skip(long n);

        concat方法：将两个流组合为一个流
 */

import java.util.stream.Stream;

public class Demo03StreamNormalMethod {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "234");
//        System.out.println(stringStream.count());
        Stream<String> limit = stringStream.limit(4);
//        limit.forEach(num -> System.out.println(num));
        Stream<String> skip = limit.skip(2);
//        skip.forEach(num -> System.out.println(num));

        Stream<String> stream1 = Stream.of("1", "2", "3");
        Stream<String> stream2 = Stream.of("4", "5", "6");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach(num -> System.out.println(num));

    }

}
