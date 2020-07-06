package Demo01StaticKeyWord;

public class Person {

    static {
        System.out.println("静态代码块已经执行");
    }

    public Person() {
        System.out.println("构造方法执行");
    }

}
