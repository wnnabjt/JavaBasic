package Demo02ReferenceConstructor;

@FunctionalInterface
public interface PersonBuilder {
    Person personBuilder(String name, int age);
}
