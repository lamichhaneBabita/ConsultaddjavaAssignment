package task05;

import java.util.Arrays;

public class DifferencesOfLargestAndSmallestNum {
    public static void main(String[] args) {
        int[] nums = {3,2,2,4,5,7,2,9};
        if(nums.length==1){
            System.out.println(nums[0]);
            return;
        }
        if(nums.length>1) {
            Arrays.sort(nums);
            System.out.println("Largest Value " + nums[nums.length - 1] +
                    " - smallest value " + nums[0] + " in array is : " + (nums[nums.length - 1] - nums[0]));
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
