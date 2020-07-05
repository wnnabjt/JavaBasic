package base.java.demo02;

/*
    定义方法的完整格式：
        修饰符 返回值类型 方法名称(参数类型 参数名称, ...) {
            方法体
            return 返回值;
        }
        修饰符：现阶段的固定写法：public static
 */

public class Demo02MethodDefine {
    public static int addNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(addNumber(1, 2));
    }
}
