package Demo01StaticKeyWord;

/*
一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类的。

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
如果有static关键字，那么不需要创建对象，直接就能通过类名称访问他。

无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用。
format：
静态变量：类名称.静态变量
静态方法：类名称.静态方法()

注意事项：
1.静态不能直接访问非静态。
原因：因为在内存中是先有的静态内容，后有的非静态内容。
2.静态方法当中不能使用this。
原因：this代表当前对象，谁调用的方法，谁就是当前对象，
静态方法无论通过什么方式调用，在javac编译后都翻译为类名称调用，因此不存在对象。
 */

public class Demo02StaticMethod {

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();

        obj.methodStatic(); //也是可行的，但是在javac编译后翻译为类名称调用
        MyClass.methodStatic();

        //本类中的方法调用
        myMethod(); //直接通过方法名调用
        Demo02StaticMethod.myMethod();//通过类名称.方法名调用
    }

    public static void myMethod() {
        System.out.println("这是自己的方法");
    }

}
