package Demo08AnnotationUseToMultiMethodTest;

public class Demo01Calculator {

    @Check
    public void add() {
        System.out.println(1 + 0);
    }

    @Check
    public void sub() {
        System.out.println(1 - 0);
    }

    @Check
    public void mul() {
        System.out.println(1 * 0);
    }

    @Check
    public void div() {
        System.out.println(1 / 0);
    }

}
