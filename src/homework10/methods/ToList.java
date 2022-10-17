package homework10.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class ToList {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers);
//        System.out.println(toList(numbers));
        toList(numbers);

        System.out.println("================================");
        for (int[] ints : toList2(numbers)) {
            System.out.println(Arrays.toString(ints));
        }
    }

//    private static ArrayList toList(int[] numbers) {
//        ArrayList<int[]> num = new ArrayList<>(Arrays.asList(numbers));
//        return num;
//    }

    private static void toList(int[] numbers) {
        ArrayList<int[]> nums = new ArrayList<>();
        nums.add(numbers);
        System.out.println(nums);

//        for (int[] intArray : nums) {
//            for (int number : intArray) {
//                System.out.println(number);
//            }
//        }

        for (int[] intArray : nums) {
            System.out.println(Arrays.toString(intArray));
        }
    }

    private static ArrayList<int[]> toList2(int[] numbers) {
        ArrayList<int[]> nums = new ArrayList<>();
        nums.add(numbers);
        return nums;
    }
}
