package Demo01StaticKeyWord;

/*
如果在声明类时一个成员变量使用了static关键字，那么这个变量不再属于某一个对象，而是属于它所在的类，多个对象共享着一份该数据。
 */

public class Demo01StaticField {

    public static void main(String[] args) {
        Student one = new Student("郭靖", 17);
        /*
        注意下面这段代码，我们只对第一个对象的room进行了赋值，而第二个对象并没有。
        但是一旦第一个的room赋值之后，之后属于该类的对象的room值都共享该值。
         */
        one.room = "北京101教室";
        Student two = new Student("黄蓉", 19);

        System.out.println("姓名:" + one.getName() + "年龄：" + one.getAge() + "所在教室："
                + one.room + "id 是" + one.getId());
        System.out.println("姓名:" + two.getName() + "年龄：" + two.getAge() + "所在教室："
                + two.room + "id 是" + two.getId());
    }

}
