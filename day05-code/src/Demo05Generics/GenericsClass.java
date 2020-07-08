package Demo05Generics;

/*
定义一个含有泛型的类：
泛型是一个未知的数据类型，当我们不确定使用什么类型的数据时，可以使用泛型。
泛型可以接受任意数据类型。

什么时候确定泛型的类型？
    在创建对象的时候确定泛型的数据类型。

泛型通配符： "?"
    "?"代表任意数据类型
    使用方式：
    1.只能作为【方法的参数】使用
    2.不能创建对象使用

泛型通配符的高级用法：
    泛型的上限限定： ? extends E 代表使用的泛型只能是E类型或者其子类
    泛型的下限限定： ? super E 代表使用的泛型只能是E类型或者其父类


eg:见 Demo06Generics类
 */

public class GenericsClass <T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public GenericsClass(T t) {
        this.t = t;
    }

    public GenericsClass() {
    }

    public void out() {
        System.out.println(t);
    }

}
