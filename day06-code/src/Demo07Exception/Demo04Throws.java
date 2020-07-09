package Demo07Exception;

/*
throws关键字：异常处理的第一种方式，交给别人处理
作用：当方法内部抛出异常对象的时候，我们就必须处理这个异常对象。
可以使用throws关键字处理异常对象，会把异常对象的声明抛出给方法的调用者处理，最终交给JVM处理。

format：在方法声明时使用。
修饰符 返回值类型 方法名() throws aaException， bbException ... {
    throws new aaException("reason");
    throws new bbException("reson");
    ...
}

注意：
1.throws关键字必需写在方法声明处。
2.throws关键字后面声明的异常必须是Exception或者Exception的子类
3.方法内部抛出多个异常对象，那么throws后边也必须声明多个异常。
【注意】 如果抛出的多个异常对象有父子关系，那么直接声明父类异常即可。
4.调用一个声明抛出异常的方法，我们就必须处理声明的异常。
要么继续使用throws声明抛出。
要么使用try...catch自己处理异常。

【【弊端】】 如果使用throws处理异常，一旦发生异常，程序将直接终止，因此后续方法中的代码就不会再执行，因此我们有下一节的try...catch方法处理异常。

 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo04Throws {

    public static void main(String[] args) throws IOException {
        readFile("c:\\a.txt");
    }

    public static void readFile(String fileName) throws IOException {
        if(fileName.equals("c:\\a")) {
            throw new FileNotFoundException("文件并不是指定路径");
        }
        if(!fileName.endsWith(".txt")) {
            throw new IOException("文件不是txt类型");
        }
        System.out.println("文件已成功读取");
    }

}
