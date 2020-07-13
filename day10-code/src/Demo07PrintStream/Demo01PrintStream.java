package Demo07PrintStream;

/*
    java.io.PrintStream：打印流
    PrintStream extends OutputStream
    PrintStream：为其他输出流添加了功能，使他们能够方便的打印各种数据值表示形式。
    PrintStream的特点：
        1.只负责数据的输出，不负责数据的读取。
        2.与其他输出流不同，PrintStream永远都不会IOException。
        3.其特有的方法，print，println。
            void print(打印任意数据类型)
            void println(打印任意数据类型并换行)

    构造方法：
        PrintStream(File file) 使用指定的文件创建一个新的打印流，而不需要自动换行。
        PrintStream(OutputStream out) 创建一个新的打印流。
        PrintStream(String fileName) 使用指定的文件名创建新的打印流，无需自动换行。

    继承自父类的成员方法：
        void close() 关闭此输出流并释放与此流相关联的任何系统资源。
        void flush() 刷新此输出流并强制任何缓冲的输出字节被写出。
        void write(byte[] b) 将 b.length字节从指定的字节数组写入此输出流。
        void write(byte[] b, int off, int len) 从指定的字节数组写入 len个字节，从偏移 off开始输出到此输出流。
        abstract void write(int b) 将指定的字节写入此输出流。
    【注意】如果使用继承自父类的方法打印数据，那么查看数据的时候会查询编码表，97 --> a
    如果使用自己特有的print或者println方法打印数据，那么数据原样输出。 97 --> 97

    System.setOut可以改变系统输出流的路径为打印流目的地
    static void setOut(PrintStream out)。
        重新分配输出流。
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo01PrintStream {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("day10-code\\src\\Demo07PrintStream\\a.txt"));
        ps.write(97);
        ps.println("Hello Java");
        System.out.println("我在终端中输出");
        System.setOut(ps);
        System.out.println("我在打印流ps中输出");
    }

}
