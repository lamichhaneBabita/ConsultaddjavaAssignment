package task05;

import java.util.Arrays;

public class FindSecondLargestElement {

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 1, 6};
        Arrays.sort(arr);
        int num = 0;
        num = arr[arr.length - 2];
        System.out.println(num);

    }

}
