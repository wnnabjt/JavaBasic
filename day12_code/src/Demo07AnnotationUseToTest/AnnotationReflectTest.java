package Demo07AnnotationUseToTest;

import java.lang.reflect.Method;

@MyAnnotation(className = "Demo07AnnotationUseToTest.Student", methodName = "eat")
public class AnnotationReflectTest {

    public static void main(String[] args) throws Exception {

        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<AnnotationReflectTest> annotationReflectTestClass = AnnotationReflectTest.class;
        //1.2获取上边的注解对象
        //其实就是在内存中生成了一个MyAnnotation的实现类对象
        MyAnnotation annotation = annotationReflectTestClass.getAnnotation(MyAnnotation.class);
        //1.3调用注解对象中定义的抽象方法获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();

        //3.加载该类进内存
        Class<?> cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //执行方法
        method.invoke(obj);
    }

}
