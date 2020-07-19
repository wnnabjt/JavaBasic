package Demo03ArrayConstructorReference;

/*
    数组的构造器引用：
        用来创建指定大小的数组。相当于new 数据类型。
        format：数据类型::new
 */

public class CreateArray<T>{

    public static void main(String[] args) {
//        String[] arr = createArr(10, len -> new String[10]);//lambda表达式写法
        final String[] arr = createArr(10, String[]::new);
        System.out.println(arr.length);
    }

    public static String[] createArr(int length, ArrayBuilderInterface <String[]> abi) {
        return abi.buildArray(length);
    }

}
