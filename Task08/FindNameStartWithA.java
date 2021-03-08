package Task08;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindNameStartWithA {
    public static void main(String[] args) {
        String []arr = {"Amita", "Binita","aaius","Bishal","Avinash"};

        Arrays.stream(arr).filter(st->(st.endsWith("A"))||(st.endsWith("a"))).forEach(System.out::println);


    }
}
