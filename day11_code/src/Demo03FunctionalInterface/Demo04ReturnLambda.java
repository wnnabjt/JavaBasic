package Demo03FunctionalInterface;

/*
    如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个lambda表达式。
    当需要通过一个方法来获取java.util.Comparator接口类型的对象作为排序器时，就可以用lambda表达式返回一个Comparator。
 */

import java.util.ArrayList;
import java.util.Comparator;

public class Demo04ReturnLambda {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("3122");
        stringArrayList.add("231");
        stringArrayList.add("123");
        stringArrayList.sort(getComparator());
        System.out.println(stringArrayList);
    }

    private static Comparator<? super String> getComparator() {
        //使用接口的匿名内部类
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };*/
        /*使用lambda表达式*/
        return (o1, o2) -> o1.compareTo(o2);
    }

}
