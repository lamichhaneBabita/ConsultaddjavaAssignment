package Task08;

import java.nio.file.LinkPermission;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        Character character = str.chars()
                .mapToObj(i->Character.toLowerCase(Character.valueOf((char)i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry ->entry.getValue()==1L)
                .map(entry->entry.getKey())
                .findFirst().get();
        System.out.println("The first non repeated character is: " +character);

    }

}
