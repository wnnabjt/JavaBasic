package Demo04Map;

/*
java.util.Hashtable 是最早期的HashMap，但由于他不支持多线程，因此大部分功能被淘汰。

HashMap集合（包括之前学过的所有集合）：可以存储null值，null键。
Hashtable集合：不可以存储null值和null键，如果强行存储，运行时会报错java.lang.NullPointerException。

Hashtable中有一个名为Properties的子类，是唯一一个和IO流结合的集合。
 */

import java.util.HashMap;
import java.util.Hashtable;

public class Demo04Hashtable {

    public static void main(String[] args) {
        HashMap<String, String> mp = new HashMap<>();
        mp.put(null, null);
        System.out.println(mp);

        Hashtable<String, String> table = new Hashtable<>();
//        table.put(null, null); //java.lang.NullPointerException
    }

}
