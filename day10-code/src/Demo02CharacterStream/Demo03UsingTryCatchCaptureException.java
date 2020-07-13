package Demo02CharacterStream;

/*
JDK1.7之前，我们必须使用try...catch...finally来对流中的异常进行处理，且相对繁琐。
JDK1.7新特性：
    在try后面可以增加一个()，括号中可以定义流对象，这个流对象的作用域就是try中。
    try代码执行完毕之后流对象自动被释放，不用写finally。
    format：
        try(定义流对象1；定义流对象2；...) {
            可能会产出异常的代码
        } catch(异常类变量 变量名) {
            异常处理逻辑
        }

JDK新特性：可以在try的前面定义流对象，在try的后面用()引入流对象的名称。
try执行完毕后，流对象也会被自动释放，不用写finally。
format：
    FileWriter fw1 = new FileWriter();
    FileWriter fw2 = new FileWriter();
    try(fw1, fw2) {
        可能会产出异常的代码
    } catch(异常类变量 变量名) {
            异常处理逻辑
    }
 */

import java.io.FileWriter;
import java.io.IOException;

public class Demo03UsingTryCatchCaptureException {

    public static void main(String[] args) throws IOException {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() throws IOException {
        FileWriter fw1 = new FileWriter("day10-code\\src\\Demo02CharacterStream\\a.txt");
        FileWriter fw2 = new FileWriter("day10-code\\src\\Demo02CharacterStream\\b.txt");
        try(fw1; fw2) {
            fw1.write("I love china");
            fw2.write("I'm BiAnJunTing");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void demo02() {
        try(FileWriter fw1 = new FileWriter("day10-code\\src\\Demo02CharacterStream\\a.txt");
            FileWriter fw2 = new FileWriter("day10-code\\src\\Demo02CharacterStream\\b.txt")) {
            fw1.write("I love china");
            fw2.write("I'm bianjunting");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void demo01() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("day10-code\\src\\Demo02CharacterStream\\a.txt");
            fw.write("I love china");

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null) { //java.lang.NullPointerException
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
