package Demo07Exception;

/*
自定义异常类：
format：
public class XxxException extends Exception / RuntimeException {
    添加一个空参数构造方法，一般调用父类的空参构造方法
    添加一个带异常信息的构造方法， 一般调用父类的异常信息构造方法
}

【注意】
1.自定义异常类一般都是以Exception结尾的。
2.自定义异常类必须继承RuntimeException或者Exception
    继承Exception，那么自定义异常类就是一个编译器异常，如果方法内部抛出了编译期异常，就必须处理这个异常，要么throws，要么try..catch
    继承RuntimeException，那么自定义异常类就是一个编译期异常，无需处理，交给JVM。
 */

public class Demo09RegisterException extends Exception {

    public Demo09RegisterException() {
        super();
    }

    public Demo09RegisterException(String message) {
        super(message);
    }
}
