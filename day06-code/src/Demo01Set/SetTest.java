package Demo01Set;

import java.util.Objects;

public class SetTest {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetTest setTest = (SetTest) o;
        return age == setTest.age &&
                Objects.equals(name, setTest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "SetTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public SetTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public SetTest() {
    }



}
