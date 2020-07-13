package Demo04Stream;

/*
    java.io.BufferedInputStream extends OutputStream
    BufferedInputStream：字节缓冲输入流

    继承自父类的共性成员方法：
        int read() 从输入流中读取数据的下一个字节
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        void close() 关闭此输入流并释放与该流关联的所有系统资源
    构造方法：
        BufferedInputStream(InputStream out) 创建一个新的缓冲输入流
        BufferedInputStream(InputStream out, int size) 创建一个新的缓冲输入流，并且指定了缓冲流中缓冲区的大小
        参数：
            InputStream out：字节输入流
                我们可以传递FileInputStream，缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的写入效率
            int size：
                指定缓冲流内部缓冲区的大小，不指定则有一个默认的大小

     使用步骤：
        1.创建FileInputStream对象，构造方法中绑定要输入的目的地。
        2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象的效率
        3.使用BufferedInputStream对象中的方法read，从指定目的地读取文件
        4.使用BufferedInputStream对象中的方法flush，把内部缓冲区中的数据，刷新到文件中
        5.释放资源(会先调用flush方法，因此第四步一般可以省略)
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Demo02BufferedInputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day10-code\\src\\Demo04Stream\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
//        while((len = bis.read()) != -1) {
//            System.out.println(len);
//        }
//        bis.close();
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
    }

}
