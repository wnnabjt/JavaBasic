package Demo02ReferenceConstructor;

/*
    构造器的引用：
        构造器引用的方式类似于类中的静态方法。
        引用方法：类名::new
 */

public class ReferenceConstructor {

    public static void main(String[] args) {
        String name = "迪丽热巴";
        int age = 18;
        /*使用lambda表达式*/
//        System.out.println(buildPerson(name, age, (name1, age1) -> new Person(name1, age1)));
        /*使用构造器引用*/
        System.out.println(buildPerson(name, age, Person::new));
    }

    public static Person buildPerson(String name, int age, PersonBuilder pb) {
        return pb.personBuilder(name, age);
    }

}
