package Demo01InnerClass;

/*
类可以作为成员变量使用，使用的时候切记要先new一个该类的对象，然后将其赋值给该成员变量。
 */

public class Demo01ClassUsingCYVariable {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        Weapon weapon = new Weapon("饮血剑");
        hero.setWeapon(weapon);

        hero.attack();

    }

}
