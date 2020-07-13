package Demo05OverrideCodeWay.Practice;

//转换文件编码方式

import java.io.*;

public class TraverseFileCodeWay {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new
                FileInputStream("C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day10-code\\src\\Demo05OverrideCodeWay\\gbk.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new
                FileOutputStream("C:\\Users\\Cruelking\\Desktop\\JavaBasic\\day10-code\\src\\Demo05OverrideCodeWay\\utf_8.txt"));
        int len;
        char[] buf = new char[1024];
        while((len = isr.read(buf)) != -1) {
            osw.write(buf, 0, len);
        }
        osw.close();
        isr.close();
    }

}
