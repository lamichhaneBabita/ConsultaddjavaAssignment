package Task08;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");

        String str = scanner.nextLine();
        String[] chars = str.split(" ");
         Arrays.stream(chars).map(String::toUpperCase).forEach(st->System.out.print(st+ " "));
       //Arrays.asList(chars).stream().map(String::toUpperCase).forEach(System.out::print);


    }
}
