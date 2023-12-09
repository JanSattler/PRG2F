package String_exercises;

import java.util.Scanner;

public class morseovka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letters = {"A .-", "B -...", "C -.-.", "D -..", "E .",
                "F ..-.", "G --.", "H ....", "I ..", "J .---",
                "K -.-", "L .-..", "M --", "N -.", "O ---",
                "P .--.", "Q --.-", "R .-.", "S ...", "T -",
                "U ..-", "V ...-", "W .--", "X -..-", "Y -.--",
                "Z --.."};
        String input = sc.nextLine();
        input = input.toUpperCase();
        String finalWord = "";

        for (int i = 0; i < (int)input.length(); i++) {
            if (input.charAt(i) == letters[i].charAt(0)){   //jestli písmeno na indexu se rovná písmenu v poli
                for (int j = 2; j < letters[i].length(); j++) {   //zapisuje znaky
                    finalWord = finalWord + letters[i].charAt(j);
                }
                finalWord = finalWord + " ";
            }
        }

        System.out.println(finalWord);
    }
}
