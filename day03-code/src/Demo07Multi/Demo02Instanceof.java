package Demo07Multi;

import Demo05Abstract.Animal;

/*
如何知道一个父类引用的对象本来是什么子类？
format：
对象 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例
 */

public class Demo02Instanceof {

    public static void main(String[] args) {
        Animals animals = new Cat(); // 多态写法，向上转型

        animals.eat();

        if(animals instanceof Cat) {
            Cat cat = (Cat) animals;
            cat.catchMouse();
        }
        if(animals instanceof  Dog) {
            Dog dog = (Dog) animals;
            dog.watchHouse();
        }
        giveMeAnPet(new Dog());
    }

    public static void giveMeAnPet(Animals animals) {
        if(animals instanceof Cat) {
            Cat cat = (Cat) animals;
            cat.catchMouse();
        }
        if(animals instanceof  Dog) {
            Dog dog = (Dog) animals;
            dog.watchHouse();
        }
    }

}
