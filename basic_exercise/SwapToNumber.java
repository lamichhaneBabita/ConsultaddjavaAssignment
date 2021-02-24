package basic_exercise;

public class SwapToNumber {
	public static void main(String[] args) {
		int num1 = 23;
		int num2 =20;
		swapWithThirdNum(num1, num2);
		
		swapWithoutThirdNum(num1, num2);
	}
	public static void swapWithThirdNum(int num1, int num2) {
		System.out.println("Num1 is: "+ num1 + " num2 is: "+ num2);
		int temp;
		temp = num1;
		num1= num2;
		num2 = temp;
		
		System.out.println("num1 is :" + num1 + " num2 is: " + num2);
		
	}
	public static void swapWithoutThirdNum(int num1, int num2) {
		System.out.println("Num1 is: "+ num1 + " num2 is: "+ num2);

		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("num1 is :" + num1 + " num2 is: " + num2);
		
	}
}
