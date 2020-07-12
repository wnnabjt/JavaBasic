package Demo05File;

/*
    File类遍历文件夹功能
    public String[] list(): 返回一个String数组，表示该File目录中的所有子文件或者目录
    public File[] listFiles(): 返回一个File数字，表示该File目录中的所有子文件或者目录

    【注意】：
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录路径不存在或者不是一个目录，就会抛出空指针异常。
 */

import java.io.File;

public class Demo06FileTraverse {
    public static void main(String[] args) {
        File file = new File("day09-code\\src\\Demo05File");
        String[] list = file.list();
        for(String fileName:list) {
            System.out.println(fileName);
        }

        File[] lists = file.listFiles();
        for(File fileName:lists) {
            System.out.println(fileName.getAbsoluteFile());
        }
    }

}
