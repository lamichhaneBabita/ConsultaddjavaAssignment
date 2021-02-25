package tasktwo;

import java.util.Scanner;

public class OperatorBased {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: " );
        int num1 = sc.nextInt();

        System.out.println("Enter the first number: " );
        int num2 = sc.nextInt();

        System.out.println( "Which operation you want ? Please enter the option 1 to 5");
        int n = sc.nextInt();



        switch (n){


            case  1:

                addTwoNumber(num1, num2);
                break;
            case  2:
                subtractTwoNumber(num1, num2);
                break;
            case 3:
                division(num1, num2);
                break;
            case  4:
                multiplication(num1, num2);
                break;
            case 5:
                averageTwoNumber(num1, num2);
                break;
            default:
                System.out.println("please choose only given option....thank you");

        }


    }
    public static void addTwoNumber(int num1, int num2){
        int sum = num1 +num2;
        if(sum<0){
            System.out.println("Oops option 1 is returning the negative number");
        }
        else
        System.out.println("Addition is : " + (num1+num2));
    }
    public static void subtractTwoNumber(int num1, int num2){
        int sub = (num1-num2);
        if(sub<0){
            System.out.println("Oops option 2 is returning the negative number");
        }
        else
        System.out.println("subtraction is : " + sub);
    }
    public static void division(int num1, int num2){
        int div =(num1*num2);
        if(div<0){
            System.out.println("Oops option 3 is returning the negative number");
        }
        else
        System.out.println("division is : " + div);
    }
    public static void multiplication(int num1, int num2){
        int mul = (num1*num2);
        if(mul<0){
            System.out.println("Oops option 4 is returning the negative number");
        }
        else
        System.out.println("multiplication is : " + mul);
    }
    public static void averageTwoNumber(int num1, int num2){
        int avg = ((num1+num2)/2);
        if(avg<0){
            System.out.println("Oops option 5 is returning the negative number");
        }
        else
        System.out.println("average is : " + avg);
    }
}
