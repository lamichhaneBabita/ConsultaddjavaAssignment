package task03;

import java.util.Scanner;

public class loopSumAndAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        double num = sc.nextDouble();
        sum(num);
        average(num);

    }
    public static void sum(double num){

        for (int i =0; i<10; i++) {
            num += i;

        }
        System.out.println( num);
    }
    public static  void average(double num){
        for (int i =0; i<10; i++) {
            num += i;

        }
        System.out.println( num/10);
    }
}
