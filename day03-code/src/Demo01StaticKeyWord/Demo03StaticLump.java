package Demo01StaticKeyWord;

/*
静态代码块：
format：
public class 类名称 {
    static {
        //静态代码块内容
    }
}

特点：当第一次使用本类的时候，静态代码块执行唯一的一次。
静态内容总是优先于非静态，因此静态代码块比构造方法先执行。

静态代码块的典型用途：
用来一次性的对静态成员变量进行赋值。
 */

public class Demo03StaticLump {

    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }

}
