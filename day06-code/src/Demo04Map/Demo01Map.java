package Demo04Map;

/*
java.util.Map<k, v>集合
Map集合的特点：
1.Map集合是双列集合。
2.Map集合中k和v的数据类型可以不同
3.Map集合中的key不允许重复，他底层是用哈希表实现的。
4.Map集合中的key和value是一一对应的。

java.util.HashMap<k, v> implements Map<k, v>接口
HashMap的特点：
1.HashMap底层是哈希表，查询的速度特别快
JDk1.8之前 数组 + 单向链表
JDK1.8之后 数组 + 单向链表/红黑树
2.HashMap是一个无序的集合，也就是说数据的存取顺序有可能不同。

java.util.LinkedHashMap<k, v> implements Map<k ,v>接口
LinkedHashMap<k, v>的特点：
1.LinkedHashMap底层是用哈希表 + 双向链表实现的，这就保证了数据的存取顺序相同。

Map接口中定义的常用方法：
V put(K key, V value)  将指定的值与该映射中的指定键相关联（可选操作）。
V get(Object key) 返回到指定键所映射的值，或 null如果此映射包含该键的映射。
V remove(Object key) 如果存在（从可选的操作），从该地图中删除一个键的映射。
boolean containsKey(Object key) 如果此映射包含指定键的映射，则返回 true 。
Set<K> keySet()  返回此地图中包含的键的Set视图。

Set<Map.Entry<K,V>> entrySet()  返回此地图中包含的映射的Set视图。
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01Map {

    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("杨颖", 150);
        mp.put("赵丽颖", 168);
        mp.put("迪丽热巴", 178);

        System.out.println(mp);

        System.out.println("赵丽颖今年" + mp.get("赵丽颖"));

        mp.remove("杨颖");
        System.out.println(mp);

        System.out.println(mp.containsKey("赵丽颖"));
        System.out.println(mp.containsKey("张子枫"));
        mp.put("张子枫", 165);
        /*使用keySet()方法将Map中的所有Key值取出来*/
        System.out.println("==========");
        System.out.println(mp);
        Set<String> strings = mp.keySet();
        /*遍历set访问key and value*/
        for(String str:strings) {
            System.out.println(str + ":" + mp.get(str));
        }

        /*使用entrySet()方法将Map中的键值对 存储到新的set中去*/
        Set<Map.Entry<String, Integer>> entries = mp.entrySet();
        /*遍历set取出Map中的所有键值对*/
        for(Map.Entry<String, Integer> pair: entries) {
            System.out.println("key is" + pair.getKey() + " value is " + pair.getValue());
        }

    }

}
