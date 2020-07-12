package Demo06Recursion;
/*
计算从1~n的和。
 */
public class Demo01CalcSum {

    public static void main(String[] args) {
        System.out.println(calc(20));
    }

    public static int calc(int n) {
        if(n < 1) return 0;
        return n + calc(n - 1);
    }

}
