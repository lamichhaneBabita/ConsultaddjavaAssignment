package tasktwo;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println();
        System.out.println();
        breakAndContinueCondition(num);

    }
    public static  void breakAndContinueCondition(int num) {
        do {
            if (num < 0) {

                System.out.print("It's Over!");
                break;
            } else

                System.out.print("Good Going");
            continue;
        }
        while(true);
            System.out.println("Negative number found");

    }

}
