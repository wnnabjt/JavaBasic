package Demo05Of;

/*
Java 1.9开始，List，Map， Set集合中添加了一个新的静态方法of，可以一次性往集合中添加很多个元素。
static <E> of (E...element)
使用前提：当前集合中的元素已经确定不再改变时使用。
注意：
1.of方式只适用于  List，Map， Set接口，不适用接口的实现类。
2.of方法的返回值是一个不可变的集合，不能再使用add，put等方法添加元素。
3.Set接口和Map接口在调用of方法时，不能有重复的元素或者key值，否则运行的时候报错。
 */

import java.util.Map;
import java.util.Set;

public class Of {

    public static void main(String[] args) {
        Set<Integer> integerSet = Set.of(1, 2, 3, 4, 5, -1);
        System.out.println(integerSet);

        Map<String, Integer> map = Map.of("张三", 12, "李四", 21, "王五", 33);
        System.out.println(map);

    }

}
