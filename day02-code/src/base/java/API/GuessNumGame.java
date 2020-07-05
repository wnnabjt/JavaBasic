package base.java.API;

import java.util.Random;
import java.util.Scanner;

public class GuessNumGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        System.out.println("我生成了一个0 ~ 100的数字，你猜一下吧");
        while(true) {
            int guess = sc.nextInt();
            if(guess > num) {
                cnt ++;
                System.out.println("猜大了");
            } else if(guess == num) {
                System.out.println("恭喜你花费了" + cnt + "次就猜中了正确答案" + num);
                break;
            } else {
                cnt ++;
                System.out.println("猜小了");
            }
        }

    }

}
