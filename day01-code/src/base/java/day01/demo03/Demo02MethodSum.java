package base.java.day01.demo03;

public class Demo02MethodSum {

    public static int getSum(int n) {
        int ans = 0;
        for(int i = 1; i <= n; i ++) {
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("结果是" + getSum(100));

    }
}
