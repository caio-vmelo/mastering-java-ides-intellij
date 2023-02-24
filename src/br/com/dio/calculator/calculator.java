package br.com.dio.calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("type the first number: ");
        a = scan.nextInt();
        System.out.println("type the second number: ");
        b = scan.nextInt();

        int sum = sum(a, b);
        int subtraction = subtraction(a, b);
        int multiply = multiply(a, b);
        double divide = divide(a, b);

        System.out.println("sum: " + sum);
        System.out.println("subtraction: " + subtraction);
        System.out.println("multiplication: " + multiply);
        System.out.println("division: " + divide);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }

}
