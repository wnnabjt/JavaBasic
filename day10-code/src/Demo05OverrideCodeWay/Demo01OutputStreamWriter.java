package Demo05OverrideCodeWay;

/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter：是字符流通向字节流的桥梁：可以使用指定的charset 将要写入流中的字符编码成字节。

    来自父类的共性成员方法：
        void write(int c) 写一个字符
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。
        void write(char[] cbuf) 写入一个字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        abstract void close() 关闭流，先刷新。
        abstract void flush() 刷新流。
    构造方法：
        OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
        OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。
        参数：
            OutputStream out：字节输出流，可以用来写转换之后的字节到文件中
            String charsetName：指定的编码表名称，不区分大小写，可以是utf-8，gbk，...【不指定默认使用UTF-8】

    使用步骤：
        1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称。
        2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储缓冲区中
        3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中。
        4.释放资源
*/

import java.io.*;

public class Demo01OutputStreamWriter {

    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new
                FileOutputStream("day10-code\\src\\Demo05OverrideCodeWay\\a.txt"), "GBK");
        osw.write("中国");
        osw.close();
    }

}
