package Demo02Object;

/*
Object类中有一个名为equals()的方法，该方法用来比较其他某个对象是否与此对象“相等”。

重写equals()方法，用来比较两个对象的属性值。

Objects类的equals方法：对两个对象进行比较，可以有效的防止“空指针异常“
@sourceCode:
public static boolean equals(Object a, Object b) {
    return (a == b) || (a != null && a.equals(b));
}

 */

import java.util.Objects;

public class Demo02Equals {

    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("迪丽热巴", 18);

/*
        public boolean equals(Object obj) {
            return (this == obj);
        }

        ==：比较运算符，返回的是一个boolean值。
        基本数据类型：比较的是值
        引用数据类型：比较的是地址
*/

        System.out.println(p1.equals(p2));

        String s1 = null;
        String s2 = "abs";

        System.out.println(Objects.equals(s2, s1));

    }

}
