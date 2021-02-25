package task03;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            count += i;
        }
        System.out.println(count);
        sc.close();
    }
}
