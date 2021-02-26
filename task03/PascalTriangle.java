package task03;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");

        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            int num = 1;
            System.out.printf("%" + (rows - i) * 2 + "s", " ");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
        scanner.close();
    }
}
