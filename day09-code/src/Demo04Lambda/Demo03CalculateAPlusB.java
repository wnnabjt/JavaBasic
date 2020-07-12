package Demo04Lambda;

public class Demo03CalculateAPlusB {

    public static void main(String[] args) {
        /*使用匿名内部类方法实现a + b*/
        invokeCal(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        /*使用lambda表达式实现a + b*/
        invokeCal(10, 20, (int a, int b) -> {
            return a + b;
        });
        //Eg:Omit
        invokeCal(30, 20, (a, b) -> (a + b));

    }

    public static void invokeCal(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是" + result);
    }

}
