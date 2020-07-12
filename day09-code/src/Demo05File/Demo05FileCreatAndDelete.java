package Demo05File;

/*
boolean createNewFile()  当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
boolean delete()  删除由此抽象路径名表示的文件或目录。
boolean mkdir()  创建由此抽象路径名命名的目录。
boolean mkdirs()  创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。

 */

import java.io.File;
import java.io.IOException;

public class Demo05FileCreatAndDelete {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {

        /*
            boolean mkdir()  创建由此抽象路径名命名的目录。
            boolean mkdirs()  创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
            创建文件的路径和名称在构造方法中给出
            返回boolean：
                true：文件夹不存在，创建文件夹
                false：文件夹存在，不会创建；构造方法中给出的路径不存在，返回false。
            【注意】：
                1.此方法只能创建文件夹
         */
        File file = new File("C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day09-code\\src\\Demo05File\\a\\b\\c");
        System.out.println(file.mkdirs());
    }

    private static void demo02() {
        /*
            返回值：boolean
            true：文件/文件夹删除成功
            false：文件夹中有其他内容，不会删除，构造方法路径不存在，返回false
            【注意】delete方法是直接从硬盘删除，不会经过回收站，删除谨慎。
         */
        File file = new File("C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day09-code\\src\\Demo05File\\a.txt");
        File file1 = new File("day09-code\\src\\Demo05File\\b.txt");
        System.out.println(file.delete());
        System.out.println(file1.delete());
    }

    private static void demo01() {

        /*
            当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
            返回boolean：
                true：文件不存在，创建
                false：文件存在，不能创建
            【注意】：
                1.此方法只能用于创建文件，不能创建文件夹
                2.创建文件的路径必须存在，否则会抛出异常
         */
        File file = new File("C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day09-code\\src\\Demo05File\\a.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file1 = new File("day09-code\\src\\Demo05File\\b.txt");
        try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file1.getAbsoluteFile());

    }

}
