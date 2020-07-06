package Demo04Extends;

public class Teacher extends Employee {

    int num = 20;

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
    }

    public void getNum() {
        System.out.println(num);
    }

    public void method() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

}
