package Demo04Stream.Demo05Practice;

/*
    对a.txt文档中的内容进行排序
    按照(0, 1, 2, 3...)
 */

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class TxtSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day10-code\\src\\Demo04Stream\\Demo05Practice\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10-code\\src\\Demo04Stream\\Demo05Practice\\b.txt"));

        HashMap <Character, String> hashMap = new HashMap<>();
        String line = null;
        while((line = br.readLine()) != null) {
            hashMap.put(line.charAt(0), line);
        }
        Set<Character> set = hashMap.keySet();
        for (Character key : set) {
            bw.write(hashMap.get(key));
            bw.newLine();
        }
        bw.close();
        br.close();
    }

}
