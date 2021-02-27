package task05;

import java.util.Arrays;

public class SecondSmallestNumber {

    public static void main(String[] args) {
        int arr[] = {2, 3, 1,1, 0, 0, 4, 6, 6};
        Arrays.sort(arr);
        int first = 0;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.println(arr[i + 1]);
                return;
            }

        }

    }

}
