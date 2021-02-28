package task05;

import java.util.Arrays;

public class RearangeMaxMinArrayValue {

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6, 7, 5};
        MaxMinArray(arr);
    }

    public static void MaxMinArray(int[] arr) {

        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        boolean flag = true;
        int largeValue = arr.length - 1;
        int small = 0;
        for (int i = 0; i < arr.length; i++) {
            if (flag) {
                temp[i] = arr[largeValue--];
            } else {
                temp[i] = arr[small++];
            }
            flag = !flag;
        }

        System.out.println(Arrays.toString(temp));
    }
}
