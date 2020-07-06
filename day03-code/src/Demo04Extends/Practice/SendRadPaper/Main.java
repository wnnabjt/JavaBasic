package Demo04Extends.Practice.SendRadPaper;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Sender sender = new Sender("洪七公", 300);
        Receiver one = new Receiver("边俊亭", 100);
        Receiver two = new Receiver("武宁", 100);
        Receiver three = new Receiver("李丽丽", 100);

        ArrayList<Integer> arrayList;
        arrayList = sender.send(20, 3);
        one.receive(arrayList);
        two.receive(arrayList);
        three.receive(arrayList);
    }

}
