package Demo05Generics;

public class Demo02GenericsClass {

    public static void main(String[] args) {
        GenericsClass<String> test = new GenericsClass<>("1234");
        System.out.println(test.getT());

        GenericsClass<Integer> test1 = new GenericsClass<Integer>(123);
        System.out.println(test1.getT());
    }

}
