package Demo07Exception;

/*
Objects类中的静态方法：
public static <T> T requireNonNull(T obj):查看指定引用对象是不是null。

源码：
public static <T> T requireNonNull(T obj) {
    if(obj == null) {
        throw new NullPointerException();
    return obj;
}
 */

import java.util.Objects;

public class Demo03ObjectsRequireNonNull {

    public static void main(String[] args) {
        Objects.requireNonNull(null, "传递的对象的值是null");
    }

}
