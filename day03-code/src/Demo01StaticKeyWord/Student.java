package Demo01StaticKeyWord;

/*
注意在此类中，我们声明了一个本地属性idCounter，用来给即将被声明的对象编号。
 */

public class Student {

    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }
}
