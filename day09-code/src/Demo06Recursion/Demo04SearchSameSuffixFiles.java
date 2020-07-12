package Demo06Recursion;

/*
    寻找某文件夹下所有的.java文件
 */

import java.io.File;

public class Demo04SearchSameSuffixFiles {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day09-code");
        printSuffixJavaFiles(file);
    }

    private static void printSuffixJavaFiles(File file) {
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for(File fileName:files) {
                printSuffixJavaFiles(fileName);
            }
        } else if(file.isFile()) {
            String name = file.getName();
            if(name.endsWith(".java")) {
                System.out.println(name);
            }
        }
    }

}
