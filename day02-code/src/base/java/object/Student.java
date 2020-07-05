package base.java.object;

/*
定义一个类，用来模拟学生”事物“。

属性（是什么）
    姓名
    年龄
行为（能做什么）
    吃饭
    睡觉
    学习

对应到Java的类当中
成员变量（属性）；
    String name;
    int age;

成员方法（行为）；//不能添加static
    public void eat() {}
    public void sleep() {}
    public void study() {}

注意事项：
1.成员变量是直接定义在类当中的，在方法外面。
2.成员方法不要写static关键字。
 */

public class Student {

    String name; // 该变量为成员变量
    int age;

    public void eat() {
        System.out.println("吃饭了");
    }

    public void sleep() {
        System.out.println("睡觉了");
    }

    public void study() {
        System.out.println("学习");
    }

}
