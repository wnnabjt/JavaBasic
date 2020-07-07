package Demo01InnerClass.Practice.RedPacketNormal;

import java.util.ArrayList;

public class NormalDivide implements OpenMode{
    @Override
    public ArrayList<Integer> divide(int totMoney, int totCount) {

        ArrayList<Integer> list = new ArrayList<>();

        int avg = totMoney / totCount;
        int mod = totMoney % totCount;

        for (int i = 0; i < totCount - 1; i++) {
            list.add(avg);
        }
        list.add(mod + avg);
        return list;

    }
}
