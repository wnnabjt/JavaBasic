package base.java.API;

/*
数组的长度不发生改变
但是ArrayList集合的长度可以改变

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全都是统一的类型。
注意：泛型只能是引用类型，不能是基本类型。

如果希望向集合ArrayList中存储基本数据类型，必须使用基本类型对应的"包装类"。
基本类型        包装类(引用类型，包装类都位于java.lang包下)
byte            Byte
short           Short
int             Integer
long            Long
float           Float
double          Double
char            Charactor
boolean         Boolean

注意事项：对于ArrayList来说，直接打印得到的不是地址值，而是内容。

ArrayList 当中的常用方法：

public boolean add(E e)：向集合当中添加元素，参数类型和泛型一致
public E get(int index)：从集合中获取元素，参数是索引
public E remove(int index)：从集合当中删除元素，参数是索引
public int size()：获取集合的尺寸长度



 */

import java.util.ArrayList;

public class Demo05ArrayList {

    public static void main(String[] args) {
        //备注：从JDK 1.7+开始，右侧的尖括号内可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();

//        System.out.println(list);
        list.add("赵丽颖");
        list.add("古力娜扎");
        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.remove(0) + "被删除");
        System.out.println(list);

        System.out.println(list.size());


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        /*
        备注：从JDK1.5+开始，支持自动装箱，自动拆箱
        自动装箱：基本类型 --> 包装类型
        自动拆箱：包装类型 --> 基本类型
         */
        int num = list1.get(1);
        System.out.println(num);
    }
}
