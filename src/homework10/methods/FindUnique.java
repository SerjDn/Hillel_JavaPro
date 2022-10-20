package homework10.methods;

import java.util.ArrayList;
import java.util.HashSet;

public class FindUnique {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        System.out.println("============================================");
        System.out.println("nums:");
        System.out.println(nums);

        System.out.println("============================================");
        System.out.println("uniqNums:");
        System.out.println(findUnique(nums));

    }

    private static ArrayList<Integer> findUnique(ArrayList<Integer> nums) {
        HashSet<Integer> uniqNums = new HashSet<>(nums);
        return new ArrayList<>(uniqNums);
    }

}
