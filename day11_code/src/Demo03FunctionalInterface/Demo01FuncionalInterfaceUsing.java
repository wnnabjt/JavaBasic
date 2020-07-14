package Demo03FunctionalInterface;

/*
    函数式接口的使用：一般可以作为方法的参数和返回值类型
 */

public class Demo01FuncionalInterfaceUsing {

    public static void main(String[] args) {
        //传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("这是接口的匿名内部类实现方法");
            }
        });
        //由于接口是函数式接口，因此可以使用lambda表达式
        show(() -> {
            System.out.println("这是函数式接口的lambda表达式实现方法");
        });
        //lambda表达式可以简化
        show(() -> System.out.println("这是函数式接口lambda表达式的简化版本"));
    }

    private static void show(MyFunctionalInterface myInterface) {
        myInterface.method();
    }

}
