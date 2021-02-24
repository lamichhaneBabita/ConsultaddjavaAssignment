package basic_exercise;

import java.util.Scanner;

public class SumTwoNumbersWithThirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: " );
		int x = sc.nextInt();
		System.out.println("Enter second number: " );
		int y = sc.nextInt();
		
		int z = sum(x,y);
		System.out.println("Sum of x, y and z with 30 is: " + z);

		
	}
	public static int sum(int x, int y) {
		int z = 30;
		
		z += x+y;
		return z;
	}

}
