package Demo04Reflect;

import java.lang.reflect.Constructor;

public class Demo02ReflectConstructor {

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        //含参构造器
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Person person = constructor.newInstance("赵丽颖", 18);
        System.out.println(person);

        //空参构造器
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1.newInstance());

        //空参构造器一般使用class对象的newInstance方法创建
        Person person1 = personClass.newInstance();
        System.out.println(person1);


    }

}
