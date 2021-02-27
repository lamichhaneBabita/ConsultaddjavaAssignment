package task05;

import java.util.Arrays;

public class DifferencesOfLargestAndSmallestNum {
    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 6, 7, 8};
        Arrays.sort(nums);
        System.out.println("Differences between Largest " + nums[nums.length - 1] +
                " and smallest " + nums[0] + " values in array is : " + (nums[nums.length - 1] - nums[0]));
    }
}
