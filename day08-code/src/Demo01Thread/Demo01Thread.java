package Demo01Thread;

public class Demo01Thread {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
//        for(int i = 0; i < 20; i ++) {
//            System.out.println("主线程" + i);
//        }
//        myThread.run();
        System.out.println(Thread.currentThread().getName());
        new MyThread("旺财").start();
        MyThread myThread1 = new MyThread();
        myThread1.setName("小强");
        myThread1.start();

        for(int i = 0; i < 20; i ++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

}
