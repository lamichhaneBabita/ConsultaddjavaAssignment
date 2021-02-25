package task03;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a long number: ");
        long num = sc.nextLong();
        int sum =0;
        int count=0;
        int digit;
        while (num!=0) {
             digit = (int) num%10;
             count++;
             sum +=digit;
             num = num/10;
        }
        System.out.println("total Digit/digits are: "+count);
        System.out.println("total sum of given digits :" +sum);
        sc.close();
    }
}
