package pole_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pickedNumbers = new int[10];
        int[] guesses = new int[5];

        for (int i = 0; i < pickedNumbers.length; i++) {
            pickedNumbers[i] = (int) (Math.random() * 30 + 1);
        }

        for (int i = 0; i < guesses.length; i++) {
            System.out.println("Zadej tip: ");
            guesses[i] = sc.nextInt();
        }

        for (int i = 0; i < guesses.length; i++) {
            for (int j = 0; j < pickedNumbers.length; j++) {
                if (guesses[i] == pickedNumbers[j]) {

                }
            }
        }
        System.out.println("Picked numbers:");
        System.out.print(Arrays.toString(pickedNumbers));
    }
}
