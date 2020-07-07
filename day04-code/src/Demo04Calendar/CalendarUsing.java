package Demo04Calendar;

import java.util.Calendar;
import java.util.Date;

/*
java.util.Calendar类是一个日历类。
Calendar类是一个抽象类，里面提供了很多操作日历字段的方法（YEAR ， MONTH ， DAY_OF_MONTH ， HOUR 等）
Calendar类无法直接使用，里面有一个静态方法getInstance()，该方法返回了Calendar类的子类对象。
static Calendar getInstance()使用默认时区和语言环境获得一个日历。

Calendar类中有四个常用的成员方法：
public int get(int field):返回给定日历字段的值
public void set(int field, int value):将日历给定字段的值设置为给定值。
public abstract void add(int field, int amount):将日历给定字段的值增加amount值，amount < 0则减少
public Date getTime():返回一个表示次Calendar对象值(从历元到现在的毫秒偏移值)的Date对象。

成员方法的参数：field
int field：日历类的字段，可以使用Calendar类的静态成员变量获取
public static final int YEAR;
public static final int MONTH;
public static final int DATE;
public static final int DAY_OF_MONTH;
public static final int HOUR;
public static final int MINUTE;
public static final int SECOND;

 */

public class CalendarUsing {

    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);

        System.out.println(rightNow.get(Calendar.YEAR));
        System.out.println(rightNow.get(Calendar.MONTH) + 1);
        System.out.println(rightNow.get(Calendar.DATE));

        rightNow.set(Calendar.YEAR, 2021);
        System.out.println(rightNow.get(Calendar.YEAR));

        rightNow.add(Calendar.MONTH, -3);
        System.out.println(rightNow.get(Calendar.MONTH) + 1);

        Date date = rightNow.getTime();

        System.out.println(date);

    }

}
