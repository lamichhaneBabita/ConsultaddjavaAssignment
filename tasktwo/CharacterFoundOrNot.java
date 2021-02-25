package tasktwo;

import java.util.Scanner;

public class CharacterFoundOrNot {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char: ");

        char ch = sc.next().toCharArray()[0];
        ch = Character.toLowerCase(ch);

        if (ch == 'r' || ch == 'a' || ch == 'n' || ch == 'd' || ch == 'o' || ch == 'm') {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }

    }

}
