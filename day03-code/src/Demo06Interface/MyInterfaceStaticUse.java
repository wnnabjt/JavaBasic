package Demo06Interface;

public class MyInterfaceStaticUse implements MyInterfaceStatic {

    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
        /*
        错误写法，应该通过接口名称直接调用
        impl.methodStatic();
         */
        MyInterfaceStatic.methodStatic();
    }

}
