package Demo06Interface;

public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("这是覆盖重写的接口默认方法");
    }
}
