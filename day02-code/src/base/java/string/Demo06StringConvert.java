package base.java.string;

/*
字符串的转换方法有以下三种：
public char[] toCharArray()：将当前字符串拆分为字符数组作为返回值。
public byte[] getBytes():获得当前字符串的底层的字节数组
public String replace(CharSequence oldString, charSequence newString):
将出现的老字符串替换成新的字符串，返回替换之后的结果新字符串。
 */

public class Demo06StringConvert {

    public static void main(String[] args) {
        String str1 = "Hello";
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        byte[] bytes = str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("========");

        String str2 = "How do you do";
        String str3 = str2.replace("o", "*");
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=======");

        String str4 = "会不会玩啊，你大爷的，你大爷的，你大爷的，你大爷的";
        String str5 = str4.replace("你大爷的", "****");
        System.out.println(str4);
        System.out.println(str5);
    }

}
