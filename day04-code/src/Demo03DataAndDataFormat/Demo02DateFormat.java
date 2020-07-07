package Demo03DataAndDataFormat;

/*
java.text.DataFormat.是日期/时间格式化子类的抽象类
作用
    格式化(日期 --> 文本)，解析(文本 --> 日期)
成员方法：
    String format(Date date) 按照指定的模式，把Date日期，格式化为符合模式的字符串。
    Date parse(String source) 把符合模式的字符串，解析为Date日期

DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类

java.text.SimpleDateFormat extends DateFormat

构造方法：
    SimpleDateFormat(String pattern) 用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat.
    参数：
        String pattern;传递指定的模式

        模式：区分大小写
        y   年
        M   月
        d   日
        H   时
        m   分
        s   秒
    使用对应的模式，会把模式替换为对应的日期和时间
        "yyyy-MM-dd HH:mm:ss"
        "yyyy年MM月dd日 HH时mm分ss秒"

format方法的使用：
    1.先声明一个SimpleDateFormat对象，声明的时候说明”模式“。
    2.然后直接调用format即可生成对应模式的字符串。

parse方法的使用：
    1.先声明一个SimpleDateFormat对象，声明的时候说明”模式“。
    2.调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期。
    注意：parse方法声明了一个异常叫做ParseException解析异常【今天先做了解，今后会详细讲解异常机制】
    如果字符串和构造方法中的模式不一样，那么程序就会抛出此异常。
    调用一个抛出了一场的方法，就必须处理这个异常，要么throws继续声明抛出这一个异常，要么try ...catch自己处理这个异常

 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02DateFormat {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        System.out.println(date);

        SimpleDateFormat txt = new SimpleDateFormat("yyyy-MM-dd");

        String time = txt.format(date);

        System.out.println(time);

        Date temp = txt.parse(time);
        System.out.println(temp);

    }

}
