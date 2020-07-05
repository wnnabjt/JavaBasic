package base.java.object;

public class Demo03Phone {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Iphone 8";
        one.price = 9867.0;
        one.color = "银色";
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("乔布斯");
        one.sendMessage();
    }
}
