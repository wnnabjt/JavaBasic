package Demo05File;

/*
boolean exists(): 此File表示的文件或目录是否实际存在
boolean isDirectory() 测试此抽象路径名表示的文件是否为目录。
boolean isFile() 测试此抽象路径名表示的文件是否为普通文件。
【注意】路径不存在直接返回false，因此用下面两个方法时，最好先用exists判断是否存在
*/

import java.io.File;

public class Demo04FileJudge {

    public static void main(String[] args) {
        File file = new File("C:\\mingw64\\bin");
        System.out.println(file.exists());

        System.out.println(file.isDirectory());

        System.out.println(file.isFile());
    }

}
