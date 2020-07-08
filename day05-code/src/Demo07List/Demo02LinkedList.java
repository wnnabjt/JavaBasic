package Demo07List;

/*
LinkedList是List接口的一个实现类。
LinkedList底层是一个链表，优点是增删快，缺点是查找慢。

该类中包含了大量操作LinkedList对象首尾的方法：

void addFirst(E e) 在该列表开头插入指定的元素。
void addLast(E e) 将指定的元素追加到此列表的末尾。
void push(E e) 将元素推送到由此列表表示的堆栈上。
E getFirst() 返回此列表中的第一个元素。
E getLast() 返回此列表中的最后一个元素。
E removeFirst() 从此列表中删除并返回第一个元素。
E pop() 从此列表表示的堆栈中弹出一个元素。
E removeLast() 从此列表中删除并返回最后一个元素。


 */

import java.util.LinkedList;

public class Demo02LinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(2);
        linkedList.addLast(3);
        linkedList.addFirst(1);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.pop());
        System.out.println(linkedList);

        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);
    }

}
