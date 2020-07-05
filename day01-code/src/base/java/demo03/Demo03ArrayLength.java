package base.java.demo03;

/*
获取数组的长度： format：array.length

数组长度在使用期间不能改变，如改变需要执行new生成一个新的数组，但此时原数组依然存在，只是没有指针指向他了。

 */

import java.sql.SQLOutput;

public class Demo03ArrayLength {
    public static void main(String[] args) {

        int[] arrayC = new int[3];
        arrayC[2] = 10;
        System.out.println(arrayC.length);
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayC[i]);
        }
        int [] arrayB = arrayC;
        System.out.println(arrayB.length);
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayB[i]);
        }
        arrayC = new int[5];
        arrayC[4] = 200;
        System.out.println(arrayC.length);
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayC[i]);
        }
    }
}
