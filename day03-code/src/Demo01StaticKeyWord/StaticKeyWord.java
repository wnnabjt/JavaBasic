package Demo01StaticKeyWord;

/*
假设我们现在写一个类
public class A {
    private String name;
    private int age;
    private String id;
    private String class_id;//所在教室
}

假设我们创建一个对象是同班同学，那所有同班同学的class_id是一样的，因此我们没有必要把他为每个对象都保存，只需要在原来的类中
保存一份就够了，也就是多个对象共享 类中的一份数据。

我们用static关键词命名属性或者方法时，此属性或者方法都是属于该类的，而非属于某一个确切的对象，但是每个对象都可以使用该属性
或者方法。
 */

public class StaticKeyWord {
}
