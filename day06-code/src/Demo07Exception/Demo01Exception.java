package Demo07Exception;

/*
java.lang.Throwable类是Java语言中所有错误或者异常的超类。
Exception:编译期异常。 java程序编译期间出现的问题。
    RuntimeException：运行期异常，java程序运行期间出现的异常。
异常可以被修复，可以通过java内部关于异常处理的类处理，然后继续执行程序。

Error：错误
错误不可以被修复，必须修改源代码，程序才能继续执行。
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo01Exception {

    public static void main(String[] args) /*throws ParseException*/{

        SimpleDateFormat txt = new SimpleDateFormat("yyyy-MM-dd");
        /*
         parse异常解决的方法：
         1.通过throws关键字，将被事先指定过得异常类型抛给JVM进行处理。
         缺点：一旦出现异常，程序终止并打印异常。
         2.通过try catch语句处理异常。
         优点：出现异常后，依然会先执行完所有main函数语句。
         */
        try {
            txt.parse("1999-01-26");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("异常处理完毕");

        int a[] = {1, 2, 3};
        try {
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println(e);
        }

        /*
            Error
            eg:
         */
//        int[] arr = new int[1024 * 1024 * 1024];
        System.out.println("后续代码");
    }

}
