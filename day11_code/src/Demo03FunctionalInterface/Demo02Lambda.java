package Demo03FunctionalInterface;

/*
    当我们往一个方法中传递参数时，如果该参数是需要进行其他操作生成的。但是由于一些特殊原因该方法中没有用到该参数。
    那么我们生成该参数就是浪费的，没有必要的，此时如果我们使用lambda表达式，就可以直接把该参数的生成接口传入方法。
    只有用到了才会执行参数的生成代码，否则不执行，这样就不存在浪费情况。

    使用lambda优化日志的案例
        lambda的特点：延迟加载
        lambda的使用前提，必须存在函数式接口
 */

public class Demo02Lambda {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = ",World!";
        showLog(1, () -> (s1 + s2));
    }

    public static void showLog(int level, MessageMerge mes) {
        if(level == 1) {
            System.out.println("合并被执行");
            System.out.println(mes.merge());
        }
    }

}
