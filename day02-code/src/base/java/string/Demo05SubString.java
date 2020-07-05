package base.java.string;

/*
字符串的截取方法：
public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin, int end):截取从begin开始，一直到end前面一个位置结束，中间的字符串。
备注：[begin, end);
 */

public class Demo05SubString {

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.substring(4, 7);
        System.out.println(str1);
        System.out.println(str3);

        /*
        【Java中字符串的内容永远不会发生改变】
            下面这种方法，字符串的内容仍然没有反生改变。
            下面有两个字符串"Hello", "Java";
            strA当中保存的是地址值。
            因此本来的他保存的是Hello的地址值。
            后来地址值变为Java的地址值。
         */
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "Java";
        System.out.println(strA); // Java

    }

}
