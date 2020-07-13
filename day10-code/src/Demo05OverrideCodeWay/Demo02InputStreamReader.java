package Demo05OverrideCodeWay;

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader:是字节流通向字符流的桥梁：它使用指定的charset 读取字节并将其解码为字符。

    继承来自父类的共性成员方法：
        int read() 从输入流中读取数据的下一个字节
        int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
        void close() 关闭此输入流并释放与该流关联的所有系统资源
    构造方法：
        InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
        InputStreamReader(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。
        参数：InputStream in：字节输入流，用来读取文件中保存的字节
        String charsetName：指定的编码表名称，不区分大小写，可以是utf-8，gbk，...【不指定默认使用UTF-8】
    使用步骤：
        1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称。
        2.使用InputStreamReader对象中的方法read读取文件
        3.释放资源
    【注意事项】：构造方法中指定的编码表名称要和文件的编码相同，否则发生乱码
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo02InputStreamReader {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new
                FileInputStream("day10-code\\src\\Demo05OverrideCodeWay\\a.txt"), "GBK");
        int len = 0;
        while((len = isr.read()) != -1) {
            System.out.println((char)len);
        }
        isr.close();
    }

}
