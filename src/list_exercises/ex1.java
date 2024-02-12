package list_exercises;

import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numArray.add(i,(int) (Math.random() * 10 + 1));
        }

        System.out.println(numArray);

        for (int i = numArray.size()-1; i >= 0; i--) {
            System.out.println(numArray.get(i));
        }
    }
}
