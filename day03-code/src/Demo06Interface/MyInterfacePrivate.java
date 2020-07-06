package Demo06Interface;

/*
问题描述：我们需要抽取一个共有方法，用来解决两个默认方法之间代码重复的问题。
但是我们这个共有方法不应该让实现类使用，应该是私有的。

解决方法：
从Java 9开始，接口当中允许定义私有方法。
1.普通私有方法，解决接口当中多个默认方法之间重复代码问题。
format：
private 返回值类型 方法名称(参数列表) {
    方法体
}

2.静态私有方法：解决接口多个静态方法之间代码重复的问题
format:
private static 返回值类型 方法名称(参数列表) {
    方法体
}
 */

public interface MyInterfacePrivate {
}
