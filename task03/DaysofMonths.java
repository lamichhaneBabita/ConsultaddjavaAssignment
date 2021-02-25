package task03;

import java.util.Scanner;

public class DaysofMonths {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of mont 1 to 12");
        int num = sc.nextInt();

        int[] monthNum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if(num<1 || num>12) {
                System.out.println("Invalid Details!");
            }
            else {
                System.out.println("Month " + num + " has " + monthNum[num - 1] + " many days.");
            }
        sc.close();
    }
}
