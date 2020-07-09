package Demo07Exception;

/*
throw关键字：
作用：可以使用throw关键字在指定的方法中抛出指定的异常。
使用格式：
throw new xxxException("异常产生的原因");

注意：
1.throw关键字必须写在方法的内部
2.throw关键字后面new的对象必须是Exception或者其子类对象。
3.throw关键字抛出指定的异常现象，我们就必须处理这个异常现象。
    运行期异常：throw关键字后面创建的是RuntimeException或者RuntimeException的子类对象，我们可以不处理，默认交给JVM处理（打印异常，中断程序）
    throw关键字创建的是编译异常（写代码的时候报错），我们就必须处理这个异常（使用throws，或者try...catch)
 */

public class Demo02ThrowKeyWord {

    public static void main(String[] args) {
//        int[] arr = null;
        int[] arr = new int[3];
        getElement(arr, 3);
    }

    public static int getElement(int[] arr, int index) {
        /*
        以后工作过程中，我们必须首先对对方穿的过来的参数进行合法性校验。
        如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数可能有问题。
         */
        if(arr == null) {
            throw new NullPointerException("传递的数组的值是null"); //【注意】指针为null异常其实是运行期异常，不需要我们自己处理
        }
        if(index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组的索引越界了");
        }
        return arr[index];
    }

}
