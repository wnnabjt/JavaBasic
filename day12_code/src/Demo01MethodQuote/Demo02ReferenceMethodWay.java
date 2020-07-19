package Demo01MethodQuote;

/*
    引用成员方法的方式：
        1.通过对象名引用成员方法：
            前提：一个类中已经存在了某种方法，对象存在。

        2.通过类名引用静态成员方法
            前提：类存在，静态方法存在。

        3.通过super引用父类的成员方法
            前提：父类存在，父类中的成员方法存在

        4.通过this引用成员方法

        【注意事项】
            使用引用时，是不能往被引用的方法中传参的，只能将他需要的参数通过其他参数传递。

 */

public class Demo02ReferenceMethodWay extends Fu{

    public static void main(String[] args) {
//        demo01();//通过对象名引用成员方法
//        demo02();//通过类名访问静态成员方法
        new Demo02ReferenceMethodWay().demo03();
        new Demo02ReferenceMethodWay().demo04();
    }

    private void demo04() {
        marry(this::buyHouse);
    }

    public void buyHouse() {
        System.out.println("北京二环买一套房四合院");
    }

    public void marry(Richable r) {
        r.buy();
    }


    private void demo03() {
//        say(() -> {
//            Fu fu = new Fu();
//            fu.sayHello();
//        });
        say(super::sayHello);
    }

    private static void say(printalble1 p) {
        p.print();
    }

    @Override
    public void sayHello() {
        System.out.println("Hello 我是子类");
    }

    private static void demo02() {
        getAbs(-100, Math::abs);
    }

    private static int getAbs(int num, printAbs p) {
        return p.calAbs(num);
    }


    private static void demo01() {
        TestClass testClass = new TestClass();
        printVariable(testClass::printString);
    }

    public static void printVariable(printalble1 p) {
        p.print();
    }

}
