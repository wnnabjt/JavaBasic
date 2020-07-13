package Demo01ByteStream;

/*
文件复制练习：一读一写
明确：
    数据源：
    数据存储目的地：

文件复制的步骤：
    1.创建一个FileInputStream对象，构造方法中传入要读取数据的目的地
    2.创建一个FileOutputStream对象，构造方法中传入要写入数据的目的地
    3.调用FileInputStream对象中的read方法，从文件中读取数据
    4.调用FileOutputStream对象中的write方法，把数据写入到文件中
    5.释放资源
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03FileCopy {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day10-code\\src\\Demo01ByteStream\\a.jpg");
        FileOutputStream fos = new FileOutputStream("day10-code\\src\\Demo01ByteStream\\aCopy.jpg");

        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();

    }

}
