package Demo07AnnotationUseToTest;

/*
    目的：用注解实现配置文件的准备，并完成类的测试功能
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String className();
    String methodName();

}
