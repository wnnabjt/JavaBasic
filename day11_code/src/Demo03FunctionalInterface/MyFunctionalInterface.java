package Demo03FunctionalInterface;

/*
    函数式接口：有且只有一个抽象方法的接口，称之为函数式接口。
    当然函数式接口中可以包含其他的方法（默认，私有，静态）

    @FunctionalInterface注解
    作用：用来检测一个接口是不是函数式接口
        是：编译通过
        否：编译失败
 */

@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void method();
}

