package Demo04Reflect;

/*

 */

import java.lang.reflect.Field;

public class Demo01ReflectField {

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) { // public int Demo04Reflect.Person.a
            System.out.println(field);
        }

        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            /**
             * public int Demo04Reflect.Person.a
             * private java.lang.String Demo04Reflect.Person.name
             * private int Demo04Reflect.Person.age
             * public int Demo04Reflect.Person.a
             * int Demo04Reflect.Person.b
             * protected int Demo04Reflect.Person.c
             * private int Demo04Reflect.Person.d
             */
            System.out.println(declaredField);
        }

        Field name = personClass.getDeclaredField("name");
        Person person = new Person();
        /*
            由于name变量是private的，因此在类外访问是不被允许的。
            但是我们可以使用暴力反射忽略访问权限修饰符的安全检查
         */
        name.setAccessible(true); //暴力反射
        name.set(person, "张三"); // java.lang.IllegalAccessException

        System.out.println(name.get(person));


    }

}
