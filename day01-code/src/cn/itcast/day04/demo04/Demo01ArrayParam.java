package cn.itcast.day04.demo04;

/*
当调用方法的时候，向方法传参的其实是数组的地址值。
 */

public class Demo01ArrayParam {

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        printArray(array);
    }

}
