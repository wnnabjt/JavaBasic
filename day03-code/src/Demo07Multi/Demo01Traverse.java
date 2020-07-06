package Demo07Multi;

/*
向上转型一定是安全的，没有问题正确的，但是还有一个弊端，
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容，此时需要将对象向下转型。
但向下转型只能转为他之前的子类的类型。
 */

public class Demo01Traverse {

    public static void main(String[] args) {
        Animals animals = new Cat(); // 多态写法，向上转型

        animals.eat();

        Cat cat = (Cat) animals;
        cat.catchMouse();

        //下面是错误的向下转型
        //本来new的时候是一只猫，现在不能强转为狗
        Dog dog = (Dog) animals;
        dog.watchHouse();
    }

}
