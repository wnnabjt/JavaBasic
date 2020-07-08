package Demo05Generics;

public class GenericsInterfaceImpl implements GenericsInterface <String>{

    @Override
    public void out(String s) {
        System.out.println(s);
    }
}
