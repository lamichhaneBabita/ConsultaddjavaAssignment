package task07;

public class MaxValue {

    public static void main(String[] args) {
        int[] a = {-6,-1,-300,800,2,4,5};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
