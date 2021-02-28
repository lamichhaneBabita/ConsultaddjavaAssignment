package task05;

public class SumPairClosestTo0 {
    public static void main(String[] args) {
        int[] arr = {1, 30, -5, 70, -8, 20, -40, 60};
        int sum1 = 0;
        int sum2 = 1;
        int min = arr[0] + arr[1];
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int tempSum = arr[i] + arr[j];
                if (Math.abs(tempSum) < Math.abs(min)) {
                    min = tempSum;
                    sum1 = i;
                    sum2 = j;
                }
            }
        }
        System.out.println(arr[sum1] + " " + arr[sum2]);
    }
}
