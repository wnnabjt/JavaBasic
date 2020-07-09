package Demo04Map.Practice;

/*
题目大意：计算一个字符串中出现的所有字符出现的次数
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CalculateTheNumberOfCharacterInAString {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < str.length(); i ++) {
            char c = str.charAt(i);
            if(mp.get(c) == null) {
                mp.put(c, 1);
            } else {
                mp.put(c, mp.get(c) + 1); // or mp.replace(c, mp.get(c) + 1)
            }
        }

        Set<Map.Entry<Character, Integer>> entries = mp.entrySet();
        for(Map.Entry<Character, Integer> pair:entries) {
            System.out.println("字符" + pair.getKey() + "出现了" + pair.getValue() + "次");
        }
    }

}
