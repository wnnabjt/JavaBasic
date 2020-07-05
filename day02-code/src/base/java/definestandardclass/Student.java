package base.java.definestandardclass;

/*
一个标准的类通常要满足下列四个组成部分：
1.所有成员变量都要使用private关键字修饰
2.每个成员变量编写一对儿Getter/Setter方法。 Alt + insert, shift 多选
3.编写一个无参数构造方法。 Alt + insert, None
4.编写一个全参数构造方法。 Alt + insert shift 多选

这样的标准的类也叫做Java Bean
 */

public class Student {

    private String name;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
