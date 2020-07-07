package Demo01InnerClass;

/*
当接口作为成员变量时，有三种使用方法。
1.用一个实现类实现该接口。
2.使用匿名内部类。
3.使用匿名对象+匿名内部类。
 */

public class Demo02InterfaceUsingCYVariable {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAge(18);
        hero.setName("艾希");
        Weapon weapon = new Weapon("饮血剑");
        hero.setWeapon(weapon);
        /*Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("施放技能开始，Biu~biu~biu");
            }
        };
        hero.setSkill(skill);*/
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("施放技能开始，Biu~biu~biu");
            }
        });
        hero.attack();
    }

}
