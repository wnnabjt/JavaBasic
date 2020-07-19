package Demo04Reflect;

public class Demo04ReflectGetClassFile {

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("Demo04Reflect.Student");
        System.out.println(aClass);

        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        Student s = new Student();
        Class<? extends Student> aClass1 = s.getClass();
        System.out.println(aClass1);

        System.out.println(aClass == aClass1);
        System.out.println(aClass == studentClass);

    }

}
