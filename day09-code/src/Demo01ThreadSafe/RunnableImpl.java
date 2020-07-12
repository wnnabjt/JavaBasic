package Demo01ThreadSafe;

/*
在这个买票程序中，三个线程同时使用共同的ticket资源，出现了线程安全问题。
1.两个线程有可能同时买同一张票。
2.有可能卖不存在的票。

解决方法一：
    使用同步代码块
    format：
        synchronized(锁对象) {
            可能会出现线程安全问题的代码（访问了共享数据的代码）
        }
    注意：
        1.同步代码块中的锁对象，可以使用任意的对象。
        2.但是必须保证多个线程使用的锁对象是同一个。
        3.锁对象的作用： 把同步代码块锁住，只让一个线程在同步代码块中执行。
解决方法二：
    使用同步方法：
    format：
        修饰符 synchronized 返回值类型 方法名称(参数列表) {
            可能会出现线程安全问题的代码（访问了共享数据的代码）
        }
    定义一个同步方法，同步方法也会把方法内部的代码锁住，只让一个线程执行。
    那么同步方法的锁对象是谁？ 就是实现类对象 new RunnableImpl()
    也就是this
解决方案三：
    使用静态同步方法：
    format:
        public static synchronized 返回值类型 方法名称(参数列表) {
            可能会出现线程安全问题的代码（访问了共享数据的代码）
        }
    静态方法也可以将方法内部的代码锁住。
    但是静态同步方法的锁对象不是this，因为静态方法会优先于创建对象执行。
    静态方法的锁对象是本类的class属性 --> class文件对象。（反射会讲）
解决方案四：
    使用Lock锁
    java.util.concurrent.locks.Lock接口
    Lock实现提供了比synchronized方法和语句可获得的更广泛的锁定操作
    Lock接口中的方法：
        void lock() 获取锁
        void unlock() 释放锁
    Lock有一个实现类 ReentrantLock implements Lock

    使用步骤：
        1.在成员变量位置创建一个ReentrantLock对象
        2.在可能会出现安全问题的代码前调用Lock接口的lock获取锁
        3.在可能会出现安全问题的代码后调用Lock接口的unlock释放锁
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable{

    //定义一个共享票源
    private static int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();

    Lock locks = new ReentrantLock();

    @Override
    public void run() {
        while(true) {
            locks.lock();
            if (ticket > 0) {
                try {
                    //提高安全问题出现的概率，让程序睡眠
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    locks.unlock();
                }
            }
        }
    }

    /*@Override
    public void run() {
        while(true) {
            //被obj锁住的同步代码块
            *//*synchronized (obj) {
                if (ticket > 0) {
                    try {
                        //提高安全问题出现的概率，让程序睡眠
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } else break;

            }*//*
            if(ticket <= 0) break;
//            payTicket();
            payTicketStatic();//静态方法只能访问静态变量

        }
    }*/

    public static synchronized void payTicketStatic() {
        if(ticket > 0) {
            try {
                //提高安全问题出现的概率，让程序睡眠
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }

    /*public synchronized void payTicket() {
        if(ticket > 0) {
            try {
                //提高安全问题出现的概率，让程序睡眠
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }*/
}
