package task04;

import java.util.Arrays;

public class SumExceptHighestAndLowestArrayValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 6, -1};
        Arrays.sort(arr);
        System.out.println(sumExceptHighestAndLowestArrayValue(arr));

    }

    public static int sumExceptHighestAndLowestArrayValue(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length - 2; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
