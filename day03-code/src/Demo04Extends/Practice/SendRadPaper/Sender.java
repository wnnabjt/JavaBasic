package Demo04Extends.Practice.SendRadPaper;

import java.util.ArrayList;

public class Sender extends Users {

    public Sender(String name, int balance) {
        super(name, balance);
    }

    public Sender() {
    }

    public ArrayList<Integer> send(int totMoney, int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (super.getBalance() >= totMoney) {
            super.setBalance(super.getBalance() - totMoney);
            System.out.println("发红包成功，总共发出去" + totMoney + "钱");
        } else {
            System.out.println("余额不足");
            return arrayList;
        }


        for(int i = 0; i < count - 1; i ++) {
            arrayList.add(totMoney / count);
        }
        arrayList.add(totMoney / count + totMoney % count);
        System.out.println(arrayList);
        return arrayList;
    }

}
