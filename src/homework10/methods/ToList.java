package homework10.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ToList {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3};

        System.out.println("============================================");
        System.out.println("Array:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("============================================");
        System.out.println("ArrayList:");
        System.out.println(toList(numbers));
    }

    private static ArrayList<Integer> toList(int[] numbers) {
        ArrayList<Integer> listOfNums = new ArrayList<>();
        for (Integer number : numbers) {
            listOfNums.add(number);
        }
        return listOfNums;
    }

}
