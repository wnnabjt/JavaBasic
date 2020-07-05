package base.java.gouzao;

/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法。
format：public 类名称(参数类型 参数名称) {
    方法体
}

注意事项：
1.构造方法的名称必须和所在的类名称完全一致。
2.构造方法不要写返回值类型，连void也不要写。
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造函数，编译器默认一个没有参数和方法体的构造方法。
5.一旦编写了至少一个构造方法，那么编译器不提供默认的构造方法。
6.构造方法也可以进行重载。
 */

public class Student {

    private String name;
    private int age;

    //无参数构造方法
    public Student() {
        System.out.println("无参数构造方法执行了");
    }

    //有参数构造方法
    public Student(String name, int age) {
        System.out.println("全参数构造方法执行了");
        this.name = name;
        this.age = age;
    }

    // Getter and Setter

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


}
