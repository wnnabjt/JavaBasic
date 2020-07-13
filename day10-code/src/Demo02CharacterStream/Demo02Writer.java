package Demo02CharacterStream;

/*
    java.io.Writer:字符输出流，是所有字符输出流的超类，是一个抽象类。

    共性的成员方法：
        void write(int c) 写一个字符
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。
        void write(char[] cbuf) 写入一个字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        abstract void close() 关闭流，先刷新。
        abstract void flush() 刷新流。

    java.io.FileWriter extends OutputStreamWriter extends Writer
    FileWriter:文件字符输出流
    作用：把内存中字符数据写入到文件中去

    构造方法：
        FileWriter(String fileName) 构造一个给定文件名的FileWriter对象。
        FileWriter(File file) 给一个File对象构造一个FileWriter对象。

    构造方法的作用：
        1.创建一个FileWriter对象
        2.会根据构造方法中传递的目的地，创建一个文件
        3.会把FileWriter对象指向创建好的文件

    字符输出流的使用步骤：
        1.创建FileWriter对象，绑定目的地。
        2.使用FileWriter方法中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）。
        3.使用FileWriter中的方法flush，把内存缓冲区中的数据刷新到文件中
        4.释放资源（会先把内存缓冲区中的数据刷新到文件中）【区别】

    【区别】：flush方法和close方法的区别：
        - flush：刷新缓冲区，流对象可以继续使用
        - close：先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。

    字符输出流的续写和换行：【参考字节输出流的续写和换行】。

 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02Writer {

    public static void main(String[] args) throws IOException {
//        demo01();
        demo02();
    }

    private static void demo02() throws IOException {
        FileWriter fw = new FileWriter("day10-code\\src\\Demo02CharacterStream\\a.txt", true);
        for(int i = 0; i < 10; i ++) {
            String str = "I love you chine.\n";
            fw.write(str);
        }
        fw.close();
    }

    private static void demo01() throws IOException {
        FileWriter fw = new FileWriter("day10-code\\src\\Demo02CharacterStream\\a.txt");
        fw.write(97);
        fw.write("\r\n");

        String str = "I love you chine.\n";

        fw.write(str);
        fw.flush();

        fw.write(str, 0, str.length());
        fw.flush();

        char[] chars = new char[] {'a', 'b', 'c', 'd', '\n'};

        fw.write(chars);
        fw.flush();

        fw.write(chars, 1, chars.length - 1);
        fw.flush();

        fw.close();
    }

}
