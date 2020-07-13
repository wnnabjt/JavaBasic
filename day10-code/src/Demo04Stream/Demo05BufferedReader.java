package Demo04Stream;

/*
    java.io.BufferedReader extends Reader

    继承自父类的共性成员方法：
        int read() 读一个字符
        int read(char[] cbuf) 将字符读入数组。
        abstract void close() 关闭流并释放与之相关联的任何系统资源。

    特有的成员方法：
        String readLine() 读取一行数据。
            行的终止符号： 通过下列字符之一即可认为某行已经终止：换行：('\n')，回车('\r')，或者回车后直接跟着换行(\r\n)。
        返回值：
            包含该行的内容，不包含任何行终止符。如果已经到达流末尾，则返回null。

    使用步骤：
        1.创建字符缓冲输入流对象，构造方法中传递字符输入流
        2.使用字符缓冲输入流对象的方法read/readLine读取文本
        3.释放资源
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo05BufferedReader {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10-code\\src\\Demo04Stream\\a.txt"));
        String line = null;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

}
