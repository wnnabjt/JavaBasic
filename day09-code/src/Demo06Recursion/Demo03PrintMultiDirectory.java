package Demo06Recursion;

import java.io.File;

public class Demo03PrintMultiDirectory {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day09-code");
        printAllFiles(file);
    }

    private static void printAllFiles(File file) {
        System.out.println(file.getName());
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for(File fileName:files) {
                printAllFiles(fileName);
            }
            System.out.println("==========");
        }
    }


}
