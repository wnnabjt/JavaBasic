package Demo01ByteStream;

/*
    java.io.OutputStream：字节输出流 ： 此类是表示输出字节流的所有类的超类

    定义了一些子类共性的成员方法：
        void close() 关闭此输出流并释放与此流相关联的任何系统资源。
        void flush() 刷新此输出流并强制任何缓冲的输出字节被写出。
        void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
        abstract void write(int b) 将指定的字节写入此输出流。

     java.io.FileOutputStream extends OutputStream
     FileOutputStream：文件字节输出流
     作用：把内存中的数据写入到硬盘的文件中

    构造方法：
            FileOutputStream(String name)创建文件输出流以指定的名称写入文件。
            FileOutputStream(File file) 创建文件输出流以写入由指定的 File对象表示的文件。
            参数：写入数据的目的地
                String name：目的地是一个文件的路径
                File file：目的地是一个文件

            构造方法的作用：
                1.创建一个FileOutputStream对象
                2.会根据构造方法中传递的文件/文件路径，创建一个空的文件
                3.会把FileOutputStream对象指向创建好的文件
    Java程序写入数据的原理(内存-->硬盘)
        Java程序-->JVM-->OS-->OS调用写数据的方法-->把数据写入到指定目的地的文件中去
    字节输出流的使用步骤：
        1.创建一个FileOutputStream对象，构造方法中传入要写入数据的目的地
        2.调用FileOutputStream对象中的write方法，把数据写入到文件中
        3.释放资源(流使用会占用一定的内存，使用完毕要把内存清空，提高程序的效率)

    Java程序对文件进行追加写：
        构造方法：
            FileOutputStream(String name, boolean append)创建文件输出流以指定的名称写入文件。
            FileOutputStream(File file, boolean append) 创建文件输出流以写入由指定的 File对象表示的文件。
        参数：String name, File file：写入数据的目的地
        boolean append：追加写开关
            true：创建对象不会覆盖原文件，继续在文件的末尾追加写数据
            false：创建一个新文件，覆盖原文件

    Java程序写换行：
        Windows：\r\n
        Linux：/n
        MacOS：/r

 */

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {

    public static void main(String[] args) throws IOException {

//        demo01();
        demo02();
    }

    private static void demo02() throws IOException {
        FileOutputStream fos = new FileOutputStream("day10-code\\src\\Demo01ByteStream\\c.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("how are you".getBytes());
            fos.write("\r\n".getBytes());
        }
    }

    private static void demo01() throws IOException {
        FileOutputStream fos1 = new FileOutputStream("day10-code\\src\\Demo01ByteStream\\a.txt");
        fos1.write(97);
        fos1.close();

        FileOutputStream fos2 = new FileOutputStream("day10-code\\src\\Demo01ByteStream\\b.txt");
        byte[] bytes = {97, -98, 99, -100, 101}; //如果字节输入一个负数，那么将由他和他后面的byte表示一个汉子
        fos2.write(bytes);

        fos2.write(bytes, 1, 2);

        byte[] bytes1 = "chine is supreme".getBytes();
        fos2.write(bytes1);
        fos2.close();
    }

}
