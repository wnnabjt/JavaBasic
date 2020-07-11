package Demo01Thread;

/*

    格式：
one     new 父类() {
            @Override
            run();
        }.start();

two     Runnable r = new Runnable() {
            @Override
            run();
        }
        new Thread(r).start();

three   链式：new Thread(new Runnable() {
            @Override
            run();
            }).start();

 */

public class Demo03NonnameInnerClassImplMultiThread {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("one");
            }
        }.start();

        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("two");
            }
        };
        new Thread(r).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("three");
            }
        }).start();

    }

}
