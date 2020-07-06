package Demo06Interface;

/*
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中的抽象方法。

如何定义一个接口：
format:
public interface 接口名称 {
    //接口内容
}

备注：换成了关键字interface之后，编译生成的字节码文件依然是 .java --> .class

如果是Java 7，那么接口中可以包含的内容有：
1.常量
2.抽象方法

如果是Java 8，还可以额外包含有
3.默认方法
4.静态方法

如果是Java 9,还可以额外包含有：
5.私有方法

接口的使用步骤：
1.接口不能直接使用，必须有一个"实现类"来“实现”该接口。
format：
public class 实现类名称 implements 接口名称 {
    //..
}
2.接口的实现类必须覆盖重写（实现）接口中的所有抽象方法。
实现：去掉abstract关键字，加上方法体大括号。
3.创建实现类的对象，进行使用。

注意事项：如果实现类并没有覆盖重写接口中的所有抽象方法，那么这个实现类自己必须是抽象类。


使用接口的时候，需要注意：
1.接口是没有静态代码块或者构造方法的。
2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
format：
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
    //覆盖重写所有抽象方法
}
3.如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
4.如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。
5.如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
6.一个类如果直接父类当中的方法和接口当中的默认方法产生了冲突，优先使用父类当中的方法。

 */

public class Interface {

    public static void main(String[] args) {
        MyInterfaceAbstractImpl Impl = new MyInterfaceAbstractImpl();
        Impl.methodAbs1();
        Impl.methodAbs2();
        Impl.methodAbs3();
        Impl.methodAbs4();

        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();

        //调用默认方法，如果实现类中没有会向上找
        a.methodDefault();

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();
    }

}
