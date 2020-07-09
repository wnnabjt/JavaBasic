package Demo06DouDiZhu;

/*
1.准备牌
2.洗牌
3.发牌
4.看牌
 */

import java.util.*;

public class DouDiZhu {

    public static void main(String[] args) {
        String[] color = {"♣", "♦", "♥", "♠"};
        String[] num = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        Map<Integer, String> map = new HashMap<>();
        int cnt = 0;
        map.put(++ cnt, "大王");
        map.put(++ cnt, "小王");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < color.length; j++) {
                map.put(++ cnt, num[i] + color[j]);
            }
        }
        ArrayList<Integer> pokerList = new ArrayList<>();
        for (int i = 1; i <= 54; i++) {
            pokerList.add(i);
        }
        Collections.shuffle(pokerList);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPan = new ArrayList<>();
        for(int i = 0; i < pokerList.size(); i ++) {
            Integer p = pokerList.get(i);
            if(i > 50) {
                diPan.add(p);
            } else if(i % 3 == 0) {
                player1.add(p);
            } else if(i % 3 == 1) {
                player2.add(p);
            } else {
                player3.add(p);
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPan);
        for(int i = 0; i < player1.size(); i ++) {
            System.out.print(map.get(player1.get(i)) + " ");
        }
        System.out.println();
        for(int i = 0; i < player2.size(); i ++) {
            System.out.print(map.get(player2.get(i)) + " ");
        }
        System.out.println();
        for(int i = 0; i < player3.size(); i ++) {
            System.out.print(map.get(player3.get(i)) + " ");
        }
        System.out.println();
        for(int i = 0; i < diPan.size(); i ++) {
            System.out.print(map.get(diPan.get(i)) + " ");
        }
        System.out.println();
    }

}
