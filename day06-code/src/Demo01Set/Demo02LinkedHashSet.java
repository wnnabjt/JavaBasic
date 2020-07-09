package Demo01Set;

/*
java.util.LinkedHashSet extends java.util.HashSet
LinkedHashSet = HashSet + 双向链表 = (哈希表 + 链表/红黑树) + 双向链表
多了一条双向链表，该双向链表用来将存储存入顺序的哈希值，为了保证用LinkedHashSet存储的元素的存取顺序相同。
同时HashSet结构也保证了LinkedHashSet结构不会存储相同的值。
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo02LinkedHashSet {

    public static void main(String[] args) {
        Set linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(-1);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet); //1 2 -1

        Set hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(-1);
        hashSet.add(1);
        System.out.println(hashSet);// -1 1 2
    }

}
