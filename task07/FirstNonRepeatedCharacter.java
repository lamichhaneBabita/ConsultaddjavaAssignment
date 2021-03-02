package task07;

import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "gibblegabbleri";
        firstNonRepeatedCharacter(str);

    }

    public static void firstNonRepeatedCharacter(String str) {
        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            boolean flag = true;
            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(ch[i]);
                break;
            }
        }
    }
}
