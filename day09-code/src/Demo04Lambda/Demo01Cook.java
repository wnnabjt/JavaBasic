package Demo04Lambda;

public class Demo01Cook {

    public static void main(String[] args) {
//        invokeCook(new Cook() {
//            @Override
//            public void makeFood() {
//                System.out.println(this + "吃饭了");
//            }
//        });

        /*使用lambda表达式实现上述invokeCook功能*/
        invokeCook(() -> {
            System.out.println("吃饭了");
        });
        //Eg:Omit
        invokeCook(() -> System.out.println("吃饭了"));

    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
