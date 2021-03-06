package Task08;

import java.util.Arrays;

public class FindAverageValue {
    public static void main(String[] args) {

        int [] arr = {2,3,1,7,5,9};
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);
    }
}
