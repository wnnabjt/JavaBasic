package Demo02Arrays;
import java.util.Arrays;

/*
java.util.Arrays 是一个数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。

public static String toString(数组)：将参数数组按照默认格式转换为字符串(format: [元素1, 元素2, ...])
public static sort(数组):按照默认升序对数组的元素进行排序。

备注：
1.如果是数值，sort默认按照升序排序。
2.如果是字符串，sort默认按照字典序排序。
3.如果是自定义类型，那么这个自定义的类需要有Comparable 或者 Comparator接口的支持。
 */

public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {10, 40, 30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        String[] strArray = {"aaa", "ccc", "ccb"};
        String strStr = Arrays.toString(strArray);
        System.out.println(strStr);

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
    }

}
