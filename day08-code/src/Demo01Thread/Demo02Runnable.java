package Demo01Thread;

public class Demo02Runnable {

    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread mt = new Thread(run, "旺财");
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main()" + i);
        }
    }

}
