package homework8;

import java.util.Arrays;

public class SumOfNums {

    public static void main(String[] args) {
//        Example #1:
        int[] nums1 = new int[] {1, 2, 3, 4};

        for (int i = 1; i < nums1.length; i++) {
            nums1[i] += nums1[i-1];
        }

        System.out.println("First array: " + Arrays.toString(nums1));

//        Example #2:
        int[] nums2 = new int[] {1, 1, 1, 1, 1};

        for (int i = 1; i < nums2.length; i++) {
            nums2[i] += nums2[i-1];
        }

        System.out.println("Second array: " + Arrays.toString(nums2));

//        Example #3:
        int[] nums3 = new int[] {3, 1, 2, 10, 1};

        for (int i = 1; i < nums3.length; i++) {
            nums3[i] += nums3[i-1];
        }

        System.out.println("Third array: " + Arrays.toString(nums3));
    }

}
