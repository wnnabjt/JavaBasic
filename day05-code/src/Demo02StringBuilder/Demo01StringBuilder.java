package Demo02StringBuilder;

/*
java.lang.StringBuilder类：字符串缓冲区，可以提高字符串的效率
StringBuilder底层是一个 byte[] value;
而String底层是一个final byte[] value;
构造方法：
    有参构造：public StringBuilder(String str);构造一个StringBuilder容器，并将字符串添加进去
    无参构造：public StringBuilder();构造一个空的StringBuilder容器

StringBuilder类的成员方法：
public StringBuilder append():添加任意类型数据的字符串格式，并返回当前调用该方法的this
参数可以是任意的数据类型
public StringBuilder reverse(StringBuilder str):将字符串反转，并返回this
但是一般调用的时候不需要为该方法建立返回值，因为该方法就是返回对象本身
public String toString(StringBuilder str):
将缓冲区内容转换为字符串

链式编程：如果一个方法的返回值依然是一个对象，那么可以继续在该方法的调用后面继续调用方法。
eg: str.append("abs").append(1).append(true);

 */

public class Demo01StringBuilder {

    public static void main(String[] args) {
        String str = "abc";
        StringBuilder strBui = new StringBuilder(str);

        System.out.println(strBui);
        strBui.append('d').append("Thanks").append(3).append(false);
        System.out.println(strBui);

        strBui.reverse();
        System.out.println(strBui);

        String str1 = strBui.toString();
        System.out.println(str1);

    }

}
