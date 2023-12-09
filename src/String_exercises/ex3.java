package String_exercises;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oppositeCase = sc.nextLine();


        for (int i = 0; i < (int)oppositeCase.length(); i++) {
            if ((i+1) % 2 == 0){    //v závorce to je protže by to jinak nejdřív modulovalo
                //oppositeCase.charAt(i)
                char znak = oppositeCase.charAt(i);
                String znak2 = String.valueOf(znak);
                znak2.toLowerCase();
                znak = znak2.charAt(0);
                oppositeCase.charAt(i) = znak;
            }
        }
    }
}
