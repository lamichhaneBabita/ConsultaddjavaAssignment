package task03;

import java.util.Scanner;

public class DaysofMonths {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of mont 1 to 12");
        int num = sc.nextInt();

        int[] monthNum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i <= num; i++) {
            System.out.println("Month " + i + " has " + monthNum[i - 1] + " many days.");
        }
        sc.close();
    }
}
