package Demo03FunctionalInterface;

/*
    java.lang.Runnable接口是一个函数式接口
    因此我们可以使用lambda表达式，创建线程
 */

public class Demo03RunnableLambda {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            startThread(() -> System.out.println(Thread.currentThread().getName()));
        }
    }

    public static void startThread(Runnable run) {
        new Thread(run).start();
    }

}
