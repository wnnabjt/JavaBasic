package Demo07Exception;

/*
子父类的异常：
    如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类，或者是不抛出异常。
    父类没有抛出异常，子类重写父类方法时也不可抛出异常。如果此时子类产生了异常，只能捕获处理，不能声明抛出。
【总结】：父类异常什么样子，子类异常就是什么样子。
 */

public class Demo08ExtendsException {
}