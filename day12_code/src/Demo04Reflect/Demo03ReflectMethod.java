package Demo04Reflect;

import java.lang.reflect.Method;

public class Demo03ReflectMethod {

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Method eat = personClass.getMethod("eat");
        Person p = new Person();
        eat.invoke(p);
        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(p, "shit");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());
        }
        eat.setAccessible(true);//暴力反射

        System.out.println(personClass.getName()); //获取类名

    }

}
