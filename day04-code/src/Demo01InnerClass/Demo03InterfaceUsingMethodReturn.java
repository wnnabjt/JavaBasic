package Demo01InnerClass;

/*
java.util.List正是ArrayList所实现的接口
接口可以作为方法的参数或者返回值。
 */

import java.util.ArrayList;
import java.util.List;

public class Demo03InterfaceUsingMethodReturn {

    public static void main(String[] args) {
        //左边是接口名称，右边是实现名称，这就是多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addNumbers(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===========");
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNumbers(List<String> list) {
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        list.add("沙扬娜拉");
        return list;
    }

}
