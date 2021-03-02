package task07;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 2, 4, 5};
        int[] arr2 = {3, 1, 7, 8, 5};
        interSectionOfTwoArray(arr1, arr2);


    }

    public static void interSectionOfTwoArray(int[] arr1, int[] arr2) {
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    temp = arr1[i];
                    System.out.print(temp + " ");
                }
            }

        }

    }
}
