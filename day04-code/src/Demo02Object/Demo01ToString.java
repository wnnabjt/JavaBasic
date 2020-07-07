package Demo02Object;

/*
    java.lang.Object类
    类Object是类层次结构的根类。每个类都使用Object类作为超类。
    所有对象（包括数组）都实现了这个类。

    toString()是Object类中的一个方法。
    如果一个类没有对toString方法覆盖重写，那么toString类打印的是某对象的地址值。

    当我们创建任何类时，需要对toString类进行重写。
    重写格式和之前的覆盖重写格式相同。例如：Person类中，对toString的重写

 */

public class Demo01ToString {

    public static void main(String[] args) {

        Object obj = new Person("张三丰", 18);
        System.out.println(obj.toString());

    }

}
