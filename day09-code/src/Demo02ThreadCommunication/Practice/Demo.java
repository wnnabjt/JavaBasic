package Demo02ThreadCommunication.Practice;

public class Demo {

    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
//        System.out.println(bz);
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }

}
