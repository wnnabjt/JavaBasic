package Demo07List;

/*
java.util.List
特定：
1.有序的集合，数据存取的顺序相同
2.有索引，可以根据索引访问集合的元素
3.允许存储重复的元素

List中包含的成员方法：
public void add(int index, E element)
public E get(int index);
public E remove(int index):
public E set(int index, E element)://设置index位置的值为e，并返回被替换的值

【注意】：使用索引操作时，要注意索引越界

List集合有三种遍历方式
1.for循环根据get(index)方法遍历
2.while循环 根据hasNext()方法和next()方法遍历
3.for each增强for循环遍历

 */

import java.util.ArrayList;
import java.util.List;

public class Demo01List {

    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        System.out.println(list);

        System.out.println("get:" + list.get(0));

        System.out.println("remove:" + list.remove(1));
        System.out.println(list);

        System.out.println("set:" + list.set(0, "AAA"));
        System.out.println(list);
    }

}
