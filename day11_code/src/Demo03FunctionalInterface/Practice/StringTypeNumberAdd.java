package Demo03FunctionalInterface.Practice;

/*
    需求：
        把String类型的数字加10，然后再以String类型结果输出。
 */

import java.util.function.Function;

public class StringTypeNumberAdd {

    public static void main(String[] args) {
        String num = "100";
        String plusNum = addString(num, s -> Integer.parseInt(num) + 10, number -> number.toString());
        System.out.println(plusNum);
    }

    public static String addString(String num, Function<String, Integer> func1, Function<Integer, String> func2) {
        return func1.andThen(func2).apply(num);
    }

}
