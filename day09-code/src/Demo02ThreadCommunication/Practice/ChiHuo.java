package Demo02ThreadCommunication.Practice;

public class ChiHuo extends Thread{

    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true) {
//            System.out.println(bz);
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃" + bz.pi + bz.xian + "包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经把" + bz.pi + bz.xian + "包子，吃完了");
                System.out.println("==========================");
            }
        }
    }
}
