package task05;

import java.lang.reflect.AnnotatedType;
import java.util.Arrays;

public class RplaceDuplicateElementTo0 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2,3, 4, 1, 5,6,6};
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        //   int j =0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; ++i) {

            if (arr[i] != arr[i + 1]) {
                temp[count++] = arr[i];

            }

        }

        temp[count++] = arr[arr.length - 1];

        for (int k = 0; k < temp.length; k++)
            System.out.print(temp[k]);

    }
}
