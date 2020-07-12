package Demo02ThreadCommunication;

/*
等待唤醒案例：线程之间的通信
    创建一个线程（消费者）：告知老板需要的包子数量，调用wait方法，放弃cpu的使用权，进入到WAITING状态（无限等待）
    创建一个线程（生产者）：花了5s做好包子，然后调用notify方法，唤醒顾客吃包子。

注意：顾客和老板线程必须使用同步代码锁包裹起来，保证等待和唤醒只有一个在执行。
同步使用的锁对象必须保证唯一。
只有锁对象才能调用wait和notify方法。

Object类中的方法：
void wait() 在其他线程调用此对象时，notify()方法或者notifyAll()方法前，导致当前线程等待
void notify() 唤醒在此对象监视器上等待的单个线程。会继续执行wait方法之后的代码。

 */

public class Demo01WaitAndNotify {

    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while(true) {
                    synchronized (obj) {
                        System.out.println("告知老板要的包子数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("开吃");
                        System.out.println("--------");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                //花了5s做包子
                while(true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("包子做好了，告知顾客");
                        obj.notify();
                    }
                }
            }
        }.start();
    }

}
