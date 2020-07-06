package Demo06Interface;

/*
从Java 8 开始，接口允许定义默认方法。
format：
public default 返回值类型 方法名称(参数列表) {
    方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题。

接口的默认方法，可以通过接口实现类，直接调用。
接口的默认方法，也可以被接口实现类进行覆盖重写。
 */

public interface MyInterfaceDefault {

    //抽象方法
    public abstract  void methodAbs();

    //新添加了一个默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }

}
