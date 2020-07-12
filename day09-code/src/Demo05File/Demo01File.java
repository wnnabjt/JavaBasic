package Demo05File;

/*
java.io.File类
文件和目录路径名的抽象表示形式。
java把电脑中的文件和文件夹（目录）封装为一个File类，方便我们对文件和文件夹进行操作。
我们可以使用File类中的方法
    创建一个文件/文件夹
    删除一个文件/文件夹
    获取文件/文件夹
    判断文件/文件夹是否存在
    对文件夹进行遍历
    获取文件的大小
File类是一个与系统无关的类，任何操作系统都可以使用这个类中的方法

重点记住这三个关键字：
    file：文件
    directory：文件夹/目录
    path：路径

    static String pathSeparator 与系统相关的路径分隔符字符，为方便起见，表示为字符串。
    static char pathSeparatorChar 与系统相关的路径分隔符。
    static String separator 与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
    static char separatorChar 与系统相关的默认名称分隔符。

File类的构造方法：
    File(String pathname)  通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
    File(String parent, String child)  从父路径名字符串和子路径名字符串创建新的 File实例。
    File(File parent, String child)  从父抽象路径名和子路径名字符串创建新的 File实例。


 */

import org.w3c.dom.ls.LSOutput;

import java.io.File;

public class Demo01File {

    public static void main(String[] args) {

        /*
            操作路径不能写死了
            Windows：C:\develop\a\a.txt
            Linux：C:/develop/a/a.txt

            "C:" + File.separator + "develop" + File.separator + "a" + File.separator + "a.txt"
         */

        System.out.println(File.pathSeparator); //Windows：分号； Linux：冒号：
        System.out.println(File.separator); //Windows：反斜杠\  Linux：正斜杠 /

        demo01();
        demo02();
        demo03();
    }

    private static void demo03() { // 父路径是File类型，可以使用File类型的方法对父路径进行操作，然后再使用路径创建对象。
        File parent = new File("C:\\a");
        String child = "a.txt";
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void demo02() {
        String parent = "C:\\a";//根据parent路径和child路径创建一个新的File实例。 将二者拼接
        String child = "a.txt";
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void demo01() {
        File file = new File("C:\\a.txt"); // 路径可以不存在，但是格式必须正确
        System.out.println(file);
    }

}
