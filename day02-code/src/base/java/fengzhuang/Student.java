package base.java.fengzhuang;

/*
private 数据无法在本类的外面直接访问，因此需要对每一个private变量设置一个Getter和一个Setter用来间接设置该参数。

Getter和Setter的命名规则：
    setXxx();
    getXxx();

注意事项：当private为boolean类型时，Getter的命名规则为isXxx(); Setter命名规则不变，为setXxx();

 */

public class Student {

    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        if(num > 0 && num < 100) {
            age = num;
        } else {
            System.out.println("年龄数据不合理");
        }
    }

    public int getAge() {
        return age;
    }

}
