package Demo04Stream;

/*
    java.io.BufferedOutputStream extends OutputStream
    BufferedOutputStream：字节缓冲输出流

    继承自父类的共性成员方法：
        void close() 关闭此输出流并释放与此流相关联的任何系统资源。
        void flush() 刷新此输出流并强制任何缓冲的输出字节被写出。
        void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
        abstract void write(int b) 将指定的字节写入此输出流。
    构造方法：
        BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流
        BufferedOutputStream(OutputStream out, int size) 创建一个新的缓冲输出流，并且指定了缓冲流中缓冲区的大小
        参数：
            OutputStream out：字节输出流
                我们可以传递FileOutputStream，缓冲流会给FileOutputStream增加一个缓冲区，提高FileOutputStream的写入效率
            int size：
                指定缓冲流内部缓冲区的大小，不指定则有一个默认的大小

     使用步骤：
        1.创建FileOutputStream对象，构造方法中绑定要输出的目的地。
        2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileOutputStream对象的效率
        3.使用BufferedOutputStream对象中的方法write，把数据写入到内部缓冲区中
        4.使用BufferedOutputStream对象中的方法flush，把内部缓冲区中的数据，刷新到文件中
        5.释放资源(会先调用flush方法，因此第四步一般可以省略)
 */

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class Demo01BufferedOutputStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day10-code\\src\\Demo04Stream\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("把数据写入到内部缓冲区中去".getBytes());
        bos.flush();
        bos.close();
    }

}
