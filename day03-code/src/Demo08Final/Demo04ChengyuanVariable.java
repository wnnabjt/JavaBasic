package Demo08Final;

/*
1.当final关键字修饰成员变量时，该成员不能再拥有Setter。
2.而且该成员只能进行一次初始化，要么直接手动赋值，要么通过构造器赋值。
3.必须保证当前类中所有构造方法，都会对这个final成员变量赋值。
 */

public class Demo04ChengyuanVariable {

    final private String name;

    public Demo04ChengyuanVariable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
