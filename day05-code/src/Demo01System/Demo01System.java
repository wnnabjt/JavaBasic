package Demo01System;

import java.lang.System;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
java.lang.System类中提供了大量的静态方法，用来获取系统相关的信息或者操作，常用的方法有:
public static long currentTimeMillis(); 返回以毫秒为单位的时间值。

public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length):
将src数组中从srcPos开始的连续length个内容copy到从dest数组的destPos元素开始的length个连续位置。
 */

public class Demo01System {

    public static void main(String[] args) throws ParseException {
        long rightNow = System.currentTimeMillis();
        System.out.println(rightNow);

        int[] arrayList1 = new int[] {1, 2, 3, 4, 5, 6};
        int[] arrayList2 = new int[] {7, 8, 9, 10, 11, 12};
        System.arraycopy(arrayList1, 0, arrayList2, 0, 5);
        System.out.println(Arrays.toString(arrayList1));
        System.out.println(Arrays.toString(arrayList2));
    }

}
