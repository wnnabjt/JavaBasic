package Demo05Abstract;

/*
format：
抽象方法：就是在返回值类型前面加上abstract关键字，然后去掉方法体的大括号，直接分号结束。
抽象类：抽象方法所在的类必须是抽象类才行。在class之前写上abstract即可。

如何使用抽象类和抽象方法：
1.不能直接创建new抽象类对象。
2.必须用一个子类来继承抽象父类。
3.子类必须覆盖重写抽象父类当中的所有抽象方法。
覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体大括号。
4.创建子类对象进行使用。

抽象类的注意事项:
1.抽象类中可以有构造方法，是供子类创建对象时，初始化父类成员使用的。
2.抽象类中，不一定包含抽象方法，抽象方法所在的类一定要是抽象类。
3.抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错，除非该子类也是抽象类。
 */

public abstract class Animal {

    //这是一个抽象方法，代表动物吃东西，但是具体吃什么不确定，因此将他抽象起来。
    public abstract void eat();

    //这是普通的成员方法
    public void normalMethod() {

    }

}
