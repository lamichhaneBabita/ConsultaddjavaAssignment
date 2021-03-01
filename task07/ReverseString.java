package task07;

public class ReverseString {
    public static void main(String[] args) {
        String str = " My name is Regish";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }
        return revString;
    }
}
