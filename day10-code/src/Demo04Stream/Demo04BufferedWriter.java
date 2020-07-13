package Demo04Stream;

/*
    java.io.BufferedWriter extends Writer
    BufferedWriter：字符缓冲输出流

    继承自父类的共性成员方法：
        void write(int c) 写一个字符
        void write(String str) 写一个字符串
        void write(String str, int off, int len) 写一个字符串的一部分。
        void write(char[] cbuf) 写入一个字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分。
        abstract void close() 关闭流，先刷新。
        abstract void flush() 刷新流。
    特有的方法：
        void newLine() 写入一个行分隔符。 不用考虑操作系统

    构造方法：
        BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流
        BufferedWriter(Writer out, int sz) 创建一个指定大小输出缓冲区的字符输出流
        参数：
            Writer out：字符输出流
                我们可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率
            int sz：指定缓冲区的大小，不写则有默认大小

    使用步骤：
        1.创建字符缓冲输出流对象，构造方法中传递字符输出流
        2.调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        3.调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据，刷新到文件中去
        4.释放资源
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04BufferedWriter {

    public static void main(String[] args) throws IOException {
        System.out.println();
        FileWriter fw = new FileWriter("day10-code\\src\\Demo04Stream\\a.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 10; i++) {
            bw.write(10 - i + "把数据写入到内存缓冲区中去Buffered");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
