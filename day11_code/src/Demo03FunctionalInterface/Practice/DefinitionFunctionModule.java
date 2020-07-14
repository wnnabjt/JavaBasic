package Demo03FunctionalInterface.Practice;

/*
    练习：自定义函数模型拼接
        题目；
            请使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
                String str = "赵丽颖,20";
                获取年龄部分，将年龄加100岁，然后以Integer类型输出。
 */

import java.util.function.Function;

public class DefinitionFunctionModule {

    public static void main(String[] args) {
        String info = "赵丽颖,20";
        System.out.println(getAge(info, s -> s.split(",")[1], s -> Integer.parseInt(s), age -> age + 100));
    }

    public static Integer getAge(String info, Function<String, String> func1,
                                            Function<String, Integer> func2,
                                            Function<Integer, Integer> func3) {
        return func1.andThen(func2).andThen(func3).apply(info);
    }

}
