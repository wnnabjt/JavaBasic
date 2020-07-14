package Demo04Stream;

/*

 */

import java.util.stream.Stream;

public class Demo04StreamLimit {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "234");
        Stream<String> limit = stringStream.limit(4);
//        limit.forEach(num -> System.out.println(num));
        Stream<String> skip = limit.skip(2);
        skip.forEach(num -> System.out.println(num));
    }

}
