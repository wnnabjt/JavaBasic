package Demo06Annotation;

@SuppressWarnings("all")
public class AnnotationTest {

    @MyAnnotation(value = 1, value2 = 3, str = {"all", "clone"}, enum1 = MyEnum.P1, over = @Override)
    public static void main(String[] args) {

    }

}
