package Demo03DataAndDataFormat;

import java.util.Date;

public class Demo01Date {

    public static void main(String[] args) {
        // 不带参数的构造方法
        Date date = new Date();
        System.out.println(date);

        //带参数的构造方法
        Date date1 = new Date(0L);
        System.out.println(date1);

        /*
        一个重要的成员方法
        long getTime();把日期转换为毫秒值。
        返回自1970年1月1日00:00:00 GMT以来Date对象表示的毫秒数
        */
        System.out.println(date.getTime());
    }

}
