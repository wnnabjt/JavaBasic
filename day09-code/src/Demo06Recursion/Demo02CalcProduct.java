package Demo06Recursion;

/*
计算1~n的阶乘
 */

import java.util.Scanner;

public class Demo02CalcProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            n = sc.nextInt();
            System.out.println(calc(n));
        }
    }

    public static long calc(int n) {
        if(n == 1) return n;
        else return n * calc(n - 1);
    }

}
