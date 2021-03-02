package task07;

import java.util.Locale;

public class UniqueCharacter {
    public static void main(String[] args) {
        System.out.println(allUniqueChars("Consultad"));

    }
    public static boolean allUniqueChars(String str){

        str = str.toLowerCase();
        for(int i =0; i<str.length(); i++)
            for(int j =0; j<str.length(); j++)
                if(i != j && str.charAt(i)==str.charAt(j))
                    return false;

        return true;
    }
}
