package Demo07Exception;

/*
try...catch：异常的第二种处理方式，自己处理异常
format：
    try {
        可能产生异常的代码
    } catch(异常类型 变量名) //用来接收try中代码块产生的异常 {

    } catch(异常类型 变量名) {

    } ...
【注意】
1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常。
2.只有当try中的代码产生了异常之后，catch语句才会执行。
3.try...catch语句执行完之后，不论有没有发生异常，都将继续执行其之后的代码。

Throwable类中定义了三个异常处理的方法：
String getMassage() 返回此throwable的简短描述
String toString() 返回此throwable的详细描述
void printStackTrace() JVM默认打印此方法，打印的异常信息最为全面

 */

import java.io.IOException;

public class Demo05TryCatch {

    public static void main(String[] args){
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
//            System.out.println(e.getMessage()); //文件类型类型不是.txt
//            System.out.println(e.toString()); //java.io.IOException: 文件类型类型不是.txt
            e.printStackTrace();
            /*java.io.IOException: 文件类型类型不是.txt
            at Demo07Exception.Demo05TryCatch.readFile(Demo05TryCatch.java:44)
            at Demo07Exception.Demo05TryCatch.main(Demo05TryCatch.java:31)*/
        }
        System.out.println("后续代码");


    }

    public static void readFile(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")) {
            throw new IOException("文件类型类型不是.txt");
        }
        System.out.println("后续代码");
    }

    /*public static void main(String[] args) {
        readFile("c:\\a.tx");
    }

    public static void readFile(String fileName) {
        if(!fileName.endsWith(".txt")) {
            try {
                throw new IOException("文件类型类型不是.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("后续代码");
    }*/

}
