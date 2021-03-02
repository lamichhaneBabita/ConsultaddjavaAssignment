package task07;

import javax.management.StandardEmitterMBean;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        int num = 370;
        System.out.println(isArmstrongNumber(num));

    }

    public static boolean isArmstrongNumber(int num) {
        int rem = 0, temp = 0;
        int original = num;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            temp = temp + (rem * rem * rem);
        }
        if (original == temp) {
            return true;
        } else {
            return false;
        }
    }
}
