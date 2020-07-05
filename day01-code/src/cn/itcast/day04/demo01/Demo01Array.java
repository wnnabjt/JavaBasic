package cn.itcast.day04.demo01;

/*
数组：用来存放多个数据的容器

数组的特点：
1.数组是一种引用类型
2.数组当中的多个数据类型必须统一
3.数组的长度在程序运行期间不能改变

数组的初始化：
1.动态初始化（指定长度） format：数据类型[] 数组名称 = new 数据类型[数组长度];
2.静态初始化（指定内容） format: 数据类型[] 数组名称 = new 数据类型[] {元素1，元素2, ..}

静态初始化数组长度等于元素个数

静态初始化数组的省略格式：
数据类型[] 数组名称 = {};

注意事项：静态初始化使用他的拆分形式进行初始化的时候不能拆成两步写。
 */

public class Demo01Array {

    public static void main(String[] args) {
        int[] arrayA = new int[100]; // 动态初始化

        String[] arraySA = new String[5];

        int[] arrayB = new int[] {1, 3, 4, 5, 6}; //静态初始化

        String[] arraySB = new String[] {"Hello", "world", "Java"};
        System.out.println(arraySB[2]);
    }
}
