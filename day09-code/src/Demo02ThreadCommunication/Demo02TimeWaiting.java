package Demo02ThreadCommunication;

/*
进入TimeWaiting有两种方式：
1.使用sleep(long ms)，在毫秒值结束后，线程被唤醒进入Runnable/Blocked状态
2.使用wait(long ms). wait()方法如果在毫秒结束之后，还没有被notify唤醒，就会自动醒来，线程被唤醒进入Runnable/Blocked状态

唤醒方法：
    void notify() 唤醒在此对象监视器上等待的单个线程
    void notifyAll() 唤醒在此对象监视器上等待的所有线程
 */

public class Demo02TimeWaiting {
}
