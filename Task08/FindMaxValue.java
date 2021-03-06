package Task08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 1, 7, 80, 9};
        int max = Arrays.stream(arr).max().getAsInt();

        // List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println("Maximum value of the given array is: " + max);
        //   System.out.println("Maximum Value of Given array is: "+ Collections.max(list));
    }
}
