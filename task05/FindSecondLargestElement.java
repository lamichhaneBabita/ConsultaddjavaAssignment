package task05;

import java.util.Arrays;

public class FindSecondLargestElement {

    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 1, 6, 6, 6};
        Arrays.sort(arr);
        int temp = 0;
        int max = arr[0];
        if(arr.length<2){
            System.out.println("Invalid Input");
            return;
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("there is no element in array");
    }

}
