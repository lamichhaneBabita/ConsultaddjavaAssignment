package task07;

public class AllCombinationOfString {
    public static void main(String[] args) {
        String s = "MYNb";
        permutation(s, 0, s.length() - 1);


    }

    public static String swap(String s, int i, int j) {
        char[] ch = s.toCharArray();
        char temp;
        temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }

    public static void permutation(String s, int start, int end) {
        if (start == end) {
            System.out.println(s);
        } else {
            for (int i = start; i <= end; i++) {
                s = swap(s, start, i);
                permutation(s, start + 1, end);
                s = swap(s, start, i);

            }
        }
    }
}
