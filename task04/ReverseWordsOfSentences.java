package task04;

import java.util.Scanner;

public class ReverseWordsOfSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any words of sentence: ");
        String str = sc.nextLine();
        String[] splt = str.split(" ");
        String reverseString = "";
        for (int j =0; j<splt.length; j++) {
            String word = splt[j];
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            reverseString +=reverseWord +" ";
        }
        System.out.println("Reverse String: "+ reverseString);
    }
}
