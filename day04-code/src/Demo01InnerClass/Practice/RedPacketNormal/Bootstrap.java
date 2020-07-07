package Demo01InnerClass.Practice.RedPacketNormal;

public class Bootstrap {

    public static void main(String[] args) {
        MyRed red = new MyRed("传统红包");
        red.setOwnerName("边俊亭");
        red.setOpenWay(new RandomDivide());
    }

}
