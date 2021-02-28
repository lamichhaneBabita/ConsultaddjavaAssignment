package task05;

import java.util.HashSet;
import java.util.Set;

public class NewLengthOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 23, 5, 2, 1, 5};
        Set<Integer> set = new HashSet<>();

        for (Integer se : arr) {
            set.add(se);

        }
        System.out.println(set.size());
    }
}
