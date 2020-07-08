package Demo05Generics.Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DouDiZhu {

    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String[] color = {"♣", "♦", "♥", "♠"};
        String[] num = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        for(int i = 0; i < color.length; i ++) {
            for(int j = 0; j < num.length; j ++) {
                poker.add(color[i] + num[j]);
            }
        }

        Collections.shuffle(poker);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPan = new ArrayList<> ();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
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
        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println(player3.toString());
        System.out.println(diPan.toString());
    }

}
