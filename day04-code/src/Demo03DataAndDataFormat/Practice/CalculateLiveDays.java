package Demo03DataAndDataFormat.Practice;

/*
计算一个人出生了多少天
 */

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class CalculateLiveDays {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为yyyy-MM-dd");
        String born = sc.next();

        SimpleDateFormat txt = new SimpleDateFormat("yyyy-MM-dd");

        Date bornTime = txt.parse(born);

        long longBornTime = bornTime.getTime();

        Date nowTime = new Date();
        long longNowTime = nowTime.getTime();

        long days = (longNowTime - longBornTime) / (1000 * 60 * 60 * 24);

        System.out.println("该人出生了" + days + "天");

    }

}
