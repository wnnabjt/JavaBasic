package Demo07Exception;

/*
finally代码块
format：
    try {
        可能产生异常的代码
    } catch(异常类型 变量名) //用来接收try中代码块产生的异常 {

    } catch(异常类型 变量名) {

    } finally {
        无论程序是否出现异常，该代码块都会执行
    }

【注意事项】：
1.finally代码块不能单独使用，必须和try一起使用
2.finally一般用于资源释放，无论程序是否出现异常，最后都需要资源释放(IO)。
3.如果finally中有return语句，那么该方法返回的永远都是finally中的结果，避免这种情况发生。
 */

public class Demo06Finally {

    public static void main(String[] args) {
        System.out.println(getA());
    }

    public static int getA() {
        int a = 10;
        try {
            return a;
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            a = 100;
            return a;
        }
    }

}
