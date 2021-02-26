package task03;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = scanner.nextInt();

        if(((year%4==0)&&(year%100!=0))||(year%400 ==0)){
            System.out.println("Leap Year!");
        }
        else
        {
            System.out.println("Not a Leap Year!");
        }

        scanner.close();
    }
}
