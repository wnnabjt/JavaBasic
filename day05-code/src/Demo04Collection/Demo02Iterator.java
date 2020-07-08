package Demo04Collection;

/*
java.util.Iterator接口，是一个用来遍历集合的迭代器。
有两个常用的方法:
    boolean hasNext():如果仍有元素可以迭代，则返回false
    E next()：返回迭代的下一个元素

Iterator迭代器是一个接口，我们无法直接使用它。需要使用Iterator的实现类对象，获取实现类对象的方法比较特殊。
Collection接口中有一个方法，叫iterator()，这个方法返回的就是迭代器的实现类对象。
    Iterator<E> iterator()，返回此collection的元素上进行迭代的迭代器。

迭代器的使用步骤（重点）：
1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)。
2.使用Iterator接口中的方法hasNext()判断还有没有下一个元素
3.使用Iterator接口中的方法next()，取出迭代器的下一个元素，并删除取出的元素。

增强for循环：底层也是使用的迭代器，使用for循环的格式，简化了迭代器的书写。
从JDK1.5之后出现的新特性。
public interface Iterable<T> 实现这个接口允许对象称为"for each"语句的目标。
Collection <E>extends Iterable <E> :所有单列表集合都可以使用增强for。

format：
    for(集合/数据类型 变量名: 集合名/数组名) {
        sout(变量名);
    }
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {

    public static void main(String[] args) {
        Collection<String> arrList = new ArrayList<>();
        arrList.add("姚明");
        arrList.add("科比");
        arrList.add("詹姆斯");

        Iterator<String> it = arrList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for(String i: arrList) {
            System.out.println(i);
        }

    }

}
