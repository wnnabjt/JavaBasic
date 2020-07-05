package base.java.API;

import java.util.ArrayList;
import java.util.Random;

public class Demo06ArrayListReturn {

    public static ArrayList<Integer> listRemove(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 1) {
                list.remove(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);
        listRemove(list);
        System.out.println(list);
    }

}

