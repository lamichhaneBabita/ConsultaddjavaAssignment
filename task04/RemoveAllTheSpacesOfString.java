package task04;

import java.util.Scanner;

public class RemoveAllTheSpacesOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some words: ");
        String str = sc.nextLine();
        removeAllTheSpaces(str);
        sc.close();
    }

    public static void removeAllTheSpaces(String str) {
        String[] spaces = str.split(" ");
        String words = spaces[0];
        String s = "";
        for (int i = 0; i < spaces.length; i++) {
            s += spaces[i];
        }

        System.out.println(s);

    }
}
