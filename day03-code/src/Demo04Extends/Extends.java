package Demo04Extends;

/*
在继承的关系中，“子类就是一个父类”，也就是说，子类可以被当作父类看待。
例如父类是员工，子类是讲师，那么“讲师就是一个员工”。关系：is-a。

定义父类的格式：
public class 父类名称 {
    与一个普通的类定义相同
}

定义子类的方法：
public class 子类名称 extends 父类名称 {
    //...
}

在父子类的继承关系当中，如果成员变量重名，则创建子类时，访问有两种方式。

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找。
间接通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找。


如何处理局部变量，子类的成员变量，父类的成员变量三者同名的情况呢。

局部变量：直接写变量名
本类的成员变量： this.成员变量名
父类的成员变量： super.成员变量名

在父子类的继承关系中，创建子类对象，访问成员方法的规则。
    创建的对象是谁，就优先适用谁的方法，如果没有就向上找。

注意事项：无论是成员变量还是成员方法，如果没有都是向上找父亲，绝对不会向下找子类。

重写(Override) Rename:覆盖 覆写
概念：在继承关系中，方法的名称一样，参数列表【也一样】。

重载(OverLoad):方法的名称一样，参数列表【不一样】。

方法的覆盖重写特点：创建的是子类对象，则优先使用子类方法。

继承关系中，父子类构造方法的访问特点。

1.子类构造方法当中有一个默认隐含的"super()"调用，所以一定是先调用的父亲构造，然后执行的子类构造。
2.子类构造可以通过super关键字来调用父类重载构造。
3.super的父类构造调用，必须是子类构造方法的第一个语句，一个子类构造方法不能多次调用super构造。

总结：子类必须调用父类构造方法，不声明则编译时自动在子类构造方法的第一行赠送一个super()。
写了则用写得指定的super调用，super只能有一个，还必须是第一个。

 */

import java.util.Iterator;

public class Extends {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();

        Assistant assistant = new Assistant();
        assistant.method();

        teacher.getNum(); // 输出Teacher本类中的数字
        System.out.println(teacher.num);
        System.out.println("=================");
        teacher.method();
    }

}
