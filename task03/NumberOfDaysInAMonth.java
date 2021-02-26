package task03;

import java.util.Calendar;
import java.util.Scanner;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        System.out.println("Enter a month in number 0 is jan to 11 is December");
        int month = sc.nextInt();
        int dayOfMonth;

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        dayOfMonth = cal.getActualMaximum(cal.DAY_OF_MONTH);

        System.out.println(dayOfMonth + " Days in  Month of " + month);
        sc.close();

    }
}
