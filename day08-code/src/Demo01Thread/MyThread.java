package Demo01Thread;

/*
创建多线程程序的第一种方式：创建Thread类的子类
java.lang.Thread类：是描述线程的类，我们想要实现多线程，就必须继承Thread类。

实现步骤：
    1.创建一个Thread类的子类。
    2.在Thread类的子类中重写run方法，设置线程任务(开启线程要做什么？)
    3.创建Thread类的子类对象
    4.调用Thread类中的start方法，Java虚拟机调用该线程的run方法。
    结果是两个线程并发的运行；当面线程（主线程）和另一个线程（创建的新线程，执行其run方法）。
    多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
Java程序属于抢占式调度，哪个线程的优先级高，哪个线程优先执行；同一个优先级，随机选择一个执行。

Thread中常用的方法：
获取线程的名称：
1.使用Thread类中的方法getName()， string getName()返回该线程的名称
2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称。
static Thread currentThread() 返回当前正在执行的线程对象的引用

设置线程的名称：
1.使用Thread类中的setName方法，void setName(String name)，改变线程的名称，使之与参数name相同。
2.创建一个带参构造方法，参数传递线程的名称，调用父类的带参构造方法，把线程名称传递给父类，让父亲(Thread)给子线程起一个名字
Thread(String name) 分配新的对象。

程序暂停毫秒：
public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停
暂停结束后，线程继续执行。

创建多线程程序的第二种方式：实现Runnable接口
java.lang.Runnable
    Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。类必须重写名称为run的无参方法。
java.lang.Thread类的构造方法
    Thread(Runnable target) 分配新的Tread对象。
    Thread(Runnable target, String name) 分配新的Tread对象。

实现步骤：
1.创建一个Runnable接口的实现类
2.在实现类中重写run方法
3.创建一个Runnable接口的实现类对象
4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
5.调用Thread类中的start方法，开启新的线程执行run方法

Thread和Runnable的区别
1.可以避免java中单继承的局限性
2.增加了程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
创建实现类中，重写了run方法：用来设置线程任务。
之后创建Thread类对象，调用start方法：用来开启线程。

 */

public class MyThread extends Thread {

//    @Override
//    public void run() {
//        System.out.println(getName());
//    }


    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t);
        String name = t.getName();
        System.out.println(name);
    }
}
