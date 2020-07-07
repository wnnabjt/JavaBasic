package Demo01InnerClass.Practice.RedPacketNormal;

import java.util.ArrayList;
import java.util.Random;

public class RandomDivide implements OpenMode{

    @Override
    public ArrayList<Integer> divide(int totMoney, int totCount) {

        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney = totMoney;
        int leftCount = totCount;
        Random rand = new Random();

        for(int i = 0; i < totCount - 1; i ++) {
            int money = rand.nextInt(leftMoney / leftCount * 2) + 1;
            if(money == 0) money ++;
            list.add(money);
            leftMoney -= money;
            leftCount --;
        }

        list.add(leftMoney);

        return list;
    }
}
