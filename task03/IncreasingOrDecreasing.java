package task03;

import java.util.Scanner;

public class IncreasingOrDecreasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1>num2 && num2>num3){
            System.out.println("Decreasing");
        }
        if (num1<num2&&num2<num3){
            System.out.println("Increasing");
        }
        else{
            System.out.println("Neither increasing or decreasing order.");
        }

    }
}
