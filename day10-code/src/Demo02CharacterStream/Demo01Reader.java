package Demo02CharacterStream;

/*
    java.io.Reader：用于读取字符流的抽象类，是所有字符输入流的超类。

    共性的成员方法
        int read() 读一个字符
        int read(char[] cbuf) 将字符读入数组。
        abstract void close() 关闭流并释放与之相关联的任何系统资源。

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader：文件字符输入流
    作用：把硬盘文件中的数据以字符的方式读取到内存中。

    构造方法：
        FileReader(File file)  创建一个新的 FileReader ，给出 File读取。
        FileReader(String fileName)  创建一个新的 FileReader ，给定要读取的文件的名称。

    FileReader构造方法的作用：
        1.创建一个FileReader对象
        2.会把FileReader对象指向要读取的文件

    字符输入流的使用步骤：
        1.创建FileReader对象绑定读取的数据源
        2.使用FileReader对象中的read方法读取文件
        3.释放资源

    String类关于char[]的构造方法：
        String(char[] value) 分配一个新的 String ，以便它表示当前包含在字符数组参数中的字符序列。
        String(char[] value, int offset, int count) 分配一个新的 String ，其中包含字符数组参数的子阵列中的字符。


 */

import java.io.FileReader;
import java.io.IOException;

public class Demo01Reader {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day10-code\\src\\Demo02CharacterStream\\a.txt");
        int len;
//        while((len = fr.read()) != -1) {
//            System.out.print((char)len);
//        }
        char[] chars = new char[1024];
        while((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        fr.close();
    }

}
