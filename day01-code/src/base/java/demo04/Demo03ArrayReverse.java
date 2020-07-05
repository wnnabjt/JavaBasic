package base.java.demo04;

import java.util.Scanner;

public class Demo03ArrayReverse {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        for (int i = 0; i < a.length / 2; i++) {
            int t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
