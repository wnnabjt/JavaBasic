package Demo04Collection;

/*
java.util.Collection接口 是所有单列集合的最顶层接口，里面定义了所有单列集合的共性使用方法。
任意的单列集合都可以使用Collection接口中的方法。

常用的共性方法：
public boolean add(E e):向集合中添加值为e的元素
public boolean remove(E e):移除集合中值为e的元素
public boolean contains(E e):判断集合是否包含值为e的元素
public boolean isEmpty():集合空返回true，反之返回false
public int size():返回集合中元素的个数
public void clear():把集合中的元素清空，但是并不删除集合
public Object[] toArray():把集合中的元素存储到数组中去
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo01Collection {

    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        arr.add("张三");
        arr.add("李四");
        arr.add("王五");
        arr.add("赵六");
        arr.add("田七");
        System.out.println(arr);
        arr.remove("田七");
        System.out.println(arr);

        System.out.println(arr.contains("王麻子"));

        System.out.println(arr.isEmpty());
        System.out.println(arr.size());

        Object[] arrList = arr.toArray();
        System.out.println(Arrays.toString(arrList));
        arr.clear();
        System.out.println(arr);
    }

}
