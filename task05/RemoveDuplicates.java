package task05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 4, 6, 3};
        removeDuplicate(arr);

    }

    public static void removeDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        Iterator it = set.iterator();
        while ((it.hasNext())) {
            System.out.print(it.next() + " ");
        }
    }
}
