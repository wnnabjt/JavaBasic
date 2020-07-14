package Demo04Stream;

/*
    如果需要将流中的元素映射到另一个流中，可以使用map方法。
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
    Function中的抽象方法： R apply(T t)。
 */

import java.util.stream.Stream;

public class Demo02StreamMap {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "234");
        Stream<Integer> integerStream = stringStream.map(s -> Integer.parseInt(s));
        integerStream.forEach(i -> System.out.println(i));
    }

}
