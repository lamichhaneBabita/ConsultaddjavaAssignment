package task05;

public class TwoElementSumToTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int k = 10;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("Pair found at Index "+j + " and" + " at Index "+ i + " = " + k);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }
}
