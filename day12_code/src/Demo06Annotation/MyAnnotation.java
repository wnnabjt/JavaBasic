package Demo06Annotation;

/*
1. 属性的返回值有下列取值
					* 基本数据类型
					* String
					* 枚举
					* 注解
					* 以上类型的数组

2. 定义了属性，在使用时需要给属性赋值
    * 如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不对该属性赋值。
    * 如果只有一个属性需要赋值且属性的名称为value，则value可以省略不写，直接定义值即可。
    * 数组赋值时，如果值有多个，使用{}包裹进行赋值，否则，可以省略{}。
 */

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD}) //表示注解可以作用于类，成员变量，成员方法。
@Retention(RetentionPolicy.RUNTIME) //表示注解会被保留到class字节码文件中，并被JVM读取到
@Documented //表示注解会被抽取到API文档
@Inherited //表示注解可以被子类继承
public @interface MyAnnotation {

    int value();
    double value1() default 1234.4;
    byte value2();

    String[] str();
    MyEnum enum1();

    Override over();

}
