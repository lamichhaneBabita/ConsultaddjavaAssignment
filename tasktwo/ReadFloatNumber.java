package tasktwo;

import java.util.Scanner;

public class ReadFloatNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter float number: ");
        float num = sc.nextFloat();

       if(num==0){
           System.out.println("Zero");
       }
       if(num>1){
           System.out.println("positive");

       }
       else if(num<1) {
           System.out.println("negative");
       }
       if(Math.abs(num)<1){
           System.out.println("small");
       }
       else if(Math.abs(num)>1000000){
           System.out.println("large");
       }
       sc.close();
    }
}
