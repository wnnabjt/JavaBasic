package base.java.fengzhuang;

public class Demo01ThisKeyWord {

    public static void main(String[] args) {
        ThisKeyWord person = new ThisKeyWord();
        person.name = "王健林";
        person.call("王思聪");//这里是由person对象调用的call，因此，ThiskeyWord类中call方法中this代表的就是这里的person
    }
}
