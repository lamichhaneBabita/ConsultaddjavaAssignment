package task07;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABCD";
        int n =str.length();
        Permutation permutation= new Permutation();
        permutation.findPermutation(str, 0, n-1);

    }
    public static void findPermutation(String str, int s, int e){
        if(s==e){
            System.out.println(str);
        }
        for(int i=s;i<=e; i++){
            str = swapChars(str,s,i);
            findPermutation(str,s+1, e);
            str =swapChars(str,s,i);
        }


    }
    public  static String swapChars(String str,int i, int j){

        char[]ch = str.toCharArray();
        char temp ;
        temp  = ch[i];
        ch[i]=ch[j];
        ch[j] = temp;

        return String.valueOf(ch);

    }
}
