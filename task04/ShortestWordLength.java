package task04;

import java.util.Scanner;

public class ShortestWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words of String.");
        String str = sc.nextLine();

        System.out.println("Length of the Shortest word is: " + shortestWordLength(str));
    }

    public static int shortestWordLength(String str) {
        int len = 0;
        String[] words = str.split(" ");
        String shortestWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        return shortestWord.length();
    }
}
