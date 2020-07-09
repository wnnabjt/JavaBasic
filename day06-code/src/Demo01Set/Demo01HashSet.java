package Demo01Set;

/*
哈希值：哈希值在java中是一个int类型的整数，由系统计算给出。实际上这里的哈希值就是某个变量存储的逻辑地址。
在Object类中有一个hashCode()方法，可以获取对象的哈希值。
public native int hashCode():
native 代表方法调用的是本地操作系统的方法。

哈希表：Java中的哈希表是使用数组 + 链表/红黑树 来实现的。当某一哈希值所对应链表的元素超过8个时
，就会将该链表中的元素转为用红黑树来存储，从而提高查找的效率。

当我们往HashSet中加入元素时，系统会先计算出要添加元素的哈希值，然后找到该哈希值所对应的链表或者红黑树。
然后使用equals()方法判断链表或者红黑树中有没有与待插入元素重复的元素，如果没有则将该元素插入对应哈希值
的链表或者红黑树中，否则不存储。

hashCode()方法和equals()方法的重写：
当我们自定义类型传入set集合中时，hashCode()和equals()方法也需要覆盖重写。
 */

import java.util.HashSet;
import java.util.Set;

public class Demo01HashSet {

    public static void main(String[] args) {
        Set<SetTest> set = new HashSet<>();

        SetTest p1 = new SetTest(18, "边俊亭");
        SetTest p2 = new SetTest(18, "边俊亭");
        SetTest p3 = new SetTest(19, "边俊亭");

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);


    }

}
