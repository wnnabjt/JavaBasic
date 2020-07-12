package Demo07Filter;

/*
需求：找出某文件夹下所有的.java子文件

File[] listFiles(FileFilter filter) 返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录。
File[] listFiles(FilenameFilter filter) 返回一个抽象路径名数组，表示由此抽象路径名表示的满足指定过滤器的目录中的文件和目录。

我们可以使用上述过滤器实现

File[] listFiles(FileFilter filter)
java.io.FileFilter接口：用于抽象路径名(File对象)的过滤器。
    作用：用来过滤（File对象）
    抽象方法：用来过滤文件的方法
        boolean accept(File pathName) 测试指定抽象路径名是否应该包含在某个路径名列表中
        参数：
        File pathName：使用ListFiles方法遍历目录，得到的每一个文件对象
File[] listFiles(FilenameFilter filter)
java.io.FilenameFilter接口：实现此接口的类实例可用于过滤文件名
    作用：用于过滤文件名称
    抽象方法：用来过滤文件的方法
        boolean accept(File dir, String name) 测试指定抽象路径名是否应该包含在某一文件列表中
        参数：
        File dir：构造方法中传递的被遍历的目录
        String name：使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称
    【注意】
        两个过滤器接口是没有实现类的，需要我们自己重写实现类，重写过滤方法accept。
 */

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo01Filter {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day09-code");
        printSuffixJavaFiles(file);
    }

    private static void printSuffixJavaFiles(File file) {
//        File[] files = file.listFiles(new FileFilterImpl());
        /*final File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                }
                return pathname.getName().endsWith(".java");
            }
        });*/

       /* final File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });*/

        File[] files = file.listFiles(pathname ->pathname.isDirectory() || pathname.getName().endsWith(".java"));
        for(File fileName:files) {
            if(fileName.isDirectory()) {
                printSuffixJavaFiles(fileName);
            } else {
                System.out.println(fileName.getAbsoluteFile());
            }
        }
    }

}
