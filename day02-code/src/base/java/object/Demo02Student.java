package base.java.object;

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

类的使用步骤：
1.导包：也就是指出需要使用的类，在什么位置。
format: import 包名称.类名称
import base.java.Object.Student
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2.创建：
format： 类名称 对象名 = new 类名称();
Student stu = new Student();

3.使用：分为两种情况：
使用成员变量： 对象名.成员变量名
使用成员方法： 对象名.成员方法名(方法参数)

注意事项：
如果成员变量没有赋值，那么将会有一个默认值，规则和数组一样。
 */

public class Demo02Student {

    public static void main(String[] args) {

        Student stu = new Student();

        stu.name = "赵丽颖";
        stu.age = 18;

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.eat();
    }

}
