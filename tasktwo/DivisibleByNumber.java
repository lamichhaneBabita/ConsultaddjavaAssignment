package tasktwo;

import java.util.Scanner;

public class DivisibleByNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Integer value");
        int num = sc.nextInt();
        divisibleByNumber(num);

    }
    public  static void divisibleByNumber(int num){

        if(num%3 == 0 && num%5 == 0){
            System.out.println("Consultadd JAVA Training");
        }
        else if(num%3 == 0){
            System.out.println("Consultadd");

        }
        else {
            if(num%5 == 0)

            System.out.println("JAVA Training");
        }
        }
}
