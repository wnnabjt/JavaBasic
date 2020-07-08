package Demo07List;

/*
java.util.Set 继承了Collection接口。
Set接口的特点：
    1.不允许存储重复的值，重复的值会被覆盖。
    2.没有索引，也不允许for循环遍历。
java.util.HashSet是Set的一个实现类。
    该类所对应的对象拥有以下特点：
    1.和Set相同的那两点。
    2.是一个无序集合，也就是说元素的存取顺序不一样。
    3.HashSet底层实现是哈希结构，该结构在查找方面非常之快。
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo03Set {

    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(1);
        integerSet.add(-1);


        Iterator<Integer> it = integerSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
