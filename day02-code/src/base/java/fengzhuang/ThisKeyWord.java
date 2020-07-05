package base.java.fengzhuang;

/*
this关键字的使用
    format：this.成员变量名

this关键字用来解决变量重名的问题

通过谁调用的方法，谁就是this。

 */

public class ThisKeyWord {
    String name;

    public void call(String name) {
        System.out.println(name + "你好，我是" + this.name);
    }
}
