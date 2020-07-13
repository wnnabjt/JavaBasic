package Demo01ByteStream;

/*
    java.io.InputStream：字节输入流
    此抽象类是表示字节输入流的所有类的超类

    定义了所有子类共性的方法：
        int read() 从输入流中读取数据的下一个字节
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        void close() 关闭此输入流并释放与该流关联的所有系统资源

     java.io.FileInputStream extends InputStream
     FileInputStream：文件字节输入流
     作用：把硬盘文件中的数据，读取到内存中使用

     构造方法：
        FileInputStream(String name)
        FileInputStream(File file)
        参数：读取文件的数据源
        构造方法的作用：
            1.会创建一个FileInputStream的对象
            2.会把FileInputStream对象指向构造方法中要读取的文件

    读取数据的原理(硬盘-->内存)
        Java程序-->JVM-->OS-->OS读取数据的方法-->读取文件
    字节输入流的使用步骤：
        1.创建一个FileInputStream对象，构造方法中传入要读取数据的目的地
        2.调用FileInputStream对象中的read方法，从文件中读取数据
        3.释放资源

    字节输入流一次读取多个字节的方法：
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中。

        【明确】：
            1.方法的参数byte[]的作用？
                起到缓冲作用，存储每次读取到的多个字节
                数组的长度一般定义为1024或者整数倍
            2.方法的返回值int是什么？
                每次读取的有效字节个数

     String类的构造方法：
        String(byte[] bytes) 通过使用平台的默认字符集解码指定的字节数组来构造新的 String 。
        String(byte[] bytes, int offset, int length) 通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String 。
 */

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02InputStream {

    public static void main(String[] args) throws IOException {
//        demo01();
        demo02();
    }

    private static void demo02() throws IOException {
        FileInputStream fis = new FileInputStream("day10-code\\src\\Demo01ByteStream\\c.txt");
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1) {
//            System.out.println(new String(bytes));
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
    }

    private static void demo01() throws IOException {
        FileInputStream fis = new FileInputStream("day10-code\\src\\Demo01ByteStream\\c.txt");

        int bytes;
        while((bytes = fis.read()) != -1) {
            System.out.println(bytes);
        }
        fis.close();
    }

}
