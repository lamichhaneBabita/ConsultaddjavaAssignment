package task07;

import java.util.Arrays;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 2, 12, -2};
        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == target) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
                }
            }
        }
    }
}
