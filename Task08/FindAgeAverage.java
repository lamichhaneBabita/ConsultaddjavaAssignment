package Task08;

import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindAgeAverage {
    public static void main(String[] args) throws FileNotFoundException {

        InputStream is = new FileInputStream("test.csv");
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));

        //bf.lines().skip(1).map(s->s.split(",")[1]).forEach(System.out::println);

        double avg = bf.lines().skip(1).map(s -> s.split(",")[1])
                .mapToDouble(Double::parseDouble).average().getAsDouble();
        System.out.println("Avg Value of given ages is: " + avg);

    }
}
