package Demo02Arrays;

import java.util.Arrays;
//import java.util.Random;

public class Practice01ArraysSort {

    public static void main(String[] args) {
        String str = "sdjlkfjsdlkfjsldkfjksdfs98fhsdfjsdlk";
        char chars[] = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

}
