package Demo05File;

/*
String getAbsolutePath()  返回此抽象路径名的绝对路径名字符串。
String getPath()  将此抽象路径名转换为路径名字符串。
String getName()  返回由此抽象路径名表示的文件或目录的名称。
long length()  返回由此抽象路径名表示的文件的长度。
 */

import java.io.File;

public class Demo03FileGet {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    private static void demo04() {//返回由此File表示的文件的长度，以字节为单位。 如果获取的文件不存在返回0
        File file1 = new File("C:\\mingw64\\notexists.exe");
        System.out.println(file1.length());
        File file3 = new File("C:\\Photo\\a.gif");
        System.out.println(file3.length());
    }

    private static void demo03() { //获取构造方法结尾部分(文件夹/文件) 名称
        File file1 = new File("C:\\mingw64\\bin");
        System.out.println(file1.getName()); //bin
        File file2 = new File("C:\\mingw64\\bin\\g++.exe");
        System.out.println(file2.getName());//g++.ext
    }

    private static void demo02() { // 获取构造方法中传递的路径
        File file1 = new File("C:\\mingw64\\bin");
        System.out.println(file1.getPath());//C:\mingw64\bin
        File file2 = new File("a.txt");
        System.out.println(file2.getPath());//a.txt
    }

    private static void demo01() { // 返回抽象路径的绝对路径
        File file1 = new File("C:\\mingw64\\bin");
        System.out.println(file1.getAbsoluteFile());//C:\mingw64\bin
        File file2 = new File("a.txt");
        System.out.println(file2.getAbsoluteFile());//C:\Users\Cruelking\Desktop\JavaBasic\a.txt
    }

}
