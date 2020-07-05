package base.java.string;

/*
对于引用类型的常量，==是用来比较地址值，如果确实需要字符串的内容比较，可以使用下面两个方法。

public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的情况下才会给出true，否则返回false；
注意事项：
1.任何对象都能用Object进行接收。
2.如果比较双方一个常量一个变量，推荐 常量.equals(变量);

public boolean equalsIgnoreCase(String str): 忽略大小写，进行内容比较
 */

public class Demo03StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println("Hello".equals(str2));
        System.out.println(str1.equals("Hello")); //不推荐这样写，因为如果str1为null，则会空指针异常报错

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));//忽略大小写
    }

}
