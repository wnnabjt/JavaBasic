package Demo04Stream;

import java.io.*;
import java.util.Collection;

public class Demo03FileCopy {

    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("day10-code\\src\\Demo01ByteStream\\a.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("day10-code\\src\\Demo04Stream\\a.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = bis.read(bytes)) != -1) {
//            bos.write(len);
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println((e - s) + "ms");
//        System.out.println(b);
//        System.out.println(e);
    }


}
