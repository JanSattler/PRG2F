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


        int idk = 0;
        System.out.print("Picked numbers:");
        System.out.println(Arrays.toString(pickedNumbers));
        System.out.println("Guesses: ");

        for (int i = 0; i < pickedNumbers.length; i++) {
            if (pickedNumbers[i] == guesses[i]) {
                System.err.println(guesses[i]);
                idk += 1;
            } else {
                System.out.println(guesses[i]);
                idk += 1;
            }
        }

        //for (int i = 0; i < pickedNumbers.length; i++) {
        //    for (int j = 0; j < guesses.length; j++) {
        //        if (guesses[j] == pickedNumbers[i]) {
        //            System.err.println(guesses[j]);
        //        } else {
        //            System.out.println(guesses[j]);
        //        }
        //    }
        //}

    }
}
