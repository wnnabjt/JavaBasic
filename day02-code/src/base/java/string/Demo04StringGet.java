package base.java.string;

/*
String当中与获取相关的常用方法有：

public int length()：返回字符串的长度。
public String concat(String str):将当前字符串和参数字符串拼接称为返回值的新字符串。
public char charAt(int index):获取指定位置的单个字符。
public int indexOf(Sting str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1.
 */

public class Demo04StringGet {

    public static void main(String[] args) {
        String str1 = "sdjflksdjflsjdlkfjsdlkfjlksdjflkdsj";
        System.out.println(str1.length());

        String str2 = "Hello";
        String str3 = "World";
        String str4 = str2.concat(str3);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str2.charAt(4));

        String str5 = "ll";
        String str6 = "ldd";
        System.out.println(str2.indexOf(str5));
        System.out.println(str3.indexOf(str6));
    }

}
