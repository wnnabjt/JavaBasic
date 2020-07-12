package Demo02ThreadCommunication.Practice;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
//        System.out.println(bz);
        int count = 0;
        while(true) {
            synchronized (bz) {
                if(bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count % 2 == 0) {
                    bz.xian = "牛肉大葱";
                    bz.pi = "冰皮";
                } else {
                    bz.xian = "三鲜馅";
                    bz.pi = "薄皮";
                }
                count ++;
                System.out.println("包子铺正在生产" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经生产好了" + bz.pi + bz.xian + "吃货可以开始吃了");
            }
        }
    }
}
