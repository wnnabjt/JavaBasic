package Demo01ThreadSafe;


public class Demo01SellTicket {

    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread sell1 = new Thread(run);
        Thread sell2 = new Thread(run);
        Thread sell3 = new Thread(run);
        sell1.start();
        sell2.start();
        sell3.start();
    }

}
