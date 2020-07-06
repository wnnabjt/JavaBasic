package Demo07Multi;

public class Zi extends Fu {

    int num = 20;
    @Override
    public void method() {
        System.out.println("子类方法");
    }

    @Override
    public void shownum() {
        System.out.println(num);
    }

    public void methodZi() {
        System.out.println("子类特有的方法");
    }

}
