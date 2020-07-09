package Demo03Collections;

/*
java.util.Collections是集合工具类，用来对集合进行操作
public static <T> boolean addAll(Collection <T> c, T ... element):往c集合中添加一些元素
public static void shuffle(List<?> list):将集合中的元素顺序打乱

public static <T> void sort(List<T> list):将集合中的元素升序排序
public static <T> void sort(List<T> list, Comparator<? super T>):将集合中的元素按照指定规则排序

如果要使用sort对自定义数据类型进行排序，那么必须覆盖重写comparable接口下的compareTo抽象方法进行重写。
要注意 compareTo方法的返回值为int，而非boolean。

comparable 和 comparator的区别：
comparable：自己(this)找别人(参数),自己需要实现comparable接口，并且重写其中的compareTo方法
comparator:相当于找一个裁判进行比较
 */

import java.lang.reflect.Array;
import java.util.*;

public class Demo01Collections {

    public static void main(String[] args) {
        ArrayList<Integer> integerCollection = new ArrayList<>();
        Collections.addAll(integerCollection, 1, 2, 3, 4, 5);
        System.out.println(integerCollection);

        Collections.shuffle(integerCollection);
        System.out.println(integerCollection);

        Collections.sort(integerCollection);
        System.out.println(integerCollection);

        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(new Student("张三", 19));
        studentArrayList.add(new Student("李四", 22));
        studentArrayList.add(new Student("王五", 21));
        studentArrayList.add(new Student("赵六", 22));
        System.out.println(studentArrayList);

        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);

        Collections.shuffle(studentArrayList);
        System.out.println(studentArrayList);

        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge() == o2.getAge()) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return o1.getAge() - o2.getAge();
                }
            }
        });
        System.out.println(studentArrayList);

    }

}
