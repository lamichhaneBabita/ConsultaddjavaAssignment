package task05;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {0,1, 2, 0, 5,3, 4};
        moveZeroToTheEnd(arr);
        System.out.println("Arrays after moving zero/zero's");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void moveZeroToTheEnd(int[] arr) {
        int temp[] = new int[arr.length];
        //Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[count++] = arr[i];

            }

        }
        while (count < arr.length)
            arr[count++] = 0;
    }
}
