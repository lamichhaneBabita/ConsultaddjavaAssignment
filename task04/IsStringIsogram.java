package task04;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class IsStringIsogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        if (isUnique(str.toCharArray()) == true && (checkConsecutive(str.toCharArray()) == true))
            System.out.println(true);
        else
            System.out.println(false);
        sc.close();
    }

    public static boolean isUnique(char[] ch) {
        // boolean isstr = true;
        //str = str.toLowerCase();
        //  char[] ch = str.toCharArray();
        int l = ch.length;
        Arrays.sort(ch);
        for (int i = 0; i < l - 1; i++) {
            if (ch[i] == ch[i + 1])
                return false;
        }
        return true;
    }

    public static boolean checkConsecutive(char[] ch) {
        int len = ch.length;
        Arrays.sort(ch);
        for (int i = 1; i < len; i++) {
            if (ch[i] - ch[i - 1] != 1)
                return true;
        }
        return false;
    }
}
