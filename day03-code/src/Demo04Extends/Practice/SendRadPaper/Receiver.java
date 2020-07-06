package Demo04Extends.Practice.SendRadPaper;

import java.util.ArrayList;

public class Receiver extends Users{
    public Receiver() {
    }

    public Receiver(String name, int balance) {
        super(name, balance);
    }

    public void receive(ArrayList<Integer> arrayList) {
        super.setBalance(super.getBalance() + arrayList.get(0));
        System.out.println("Dear " + super.getName() + " 您抢到了" + arrayList.get(0) + ", 您的余额为" + super.getBalance());
        arrayList.remove(0);
    }

}
