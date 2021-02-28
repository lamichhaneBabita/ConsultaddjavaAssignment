package Task06;

import java.util.Scanner;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {

    }


    public Complex sum(Complex num1, Complex num2) {
        Complex num = new Complex();
        num.real = num1.real + num2.real;
        num.imaginary = num1.imaginary + num2.imaginary;
        return num;
    }

    public Complex difference(Complex num1, Complex num2) {
        Complex num = new Complex();
        num.real = num1.real - num2.real;
        num.imaginary = num1.imaginary - num2.imaginary;
        return num;
    }

    public Complex product(Complex num1, Complex num2) {
        Complex num = new Complex();
        num.real = num1.real * num2.real;
        num.imaginary = num1.imaginary * num2.imaginary;
        return num;
    }

    @Override
    public String toString() {
        return "{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first real number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second real Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter first imaginary number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter second imaginary Number: ");
        int num4 = sc.nextInt();
        Complex c1 = new Complex(num1, num2);
        c1.toString();
        Complex c2 = new Complex(num3, num4);
        c2.toString();

        Complex c3 = new Complex(num1, num2);
        c3 = c3.sum(c1, c2);
        System.out.println("Sum of: " + c3.toString());

        c3 = c3.difference(c1, c2);
        System.out.println("Diferences of : " + c3.toString());

        c3 = c3.product(c1, c2);
        System.out.println("Product of: " + c3.toString());


    }
}
