package Demo05Generics;

public class GenericsInterface02<T> implements GenericsInterface <T> {

    @Override
    public void out(T t) {
        System.out.println(t);
    }
}
