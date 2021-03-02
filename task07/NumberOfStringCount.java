package task07;

public class NumberOfStringCount {

    public static void main(String[] args) {
        String str = "I love Consultadd.";
        System.out.println("Number of word/words: " + countString(str));

    }

    public static int countString(String str) {

        int count = 0;
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++) {
            count++;
        }
        return count;
    }
}
