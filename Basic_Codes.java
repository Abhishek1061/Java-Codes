import java.sql.SQLOutput;
import java.util.Scanner;

public class Basic_Codes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
////        Question No 1 : Write a program to print whether a number is even or odd, also take input from the user.
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("Number entered is Even");
        }else{
            System.out.println("Number entered is Odd");
        }

////        Question No 2: Take name as input and print a greeting message for that particular name.
        System.out.println("Enter the Name: ");
        String name = input.next();
        System.out.println("Namaste!!  " + name + ".");

////        Question No 3: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        System.out.println("Enter the Principal value: ");
        int PV = input.nextInt();
        System.out.println("Enter the Time value in years : ");
        int TV = input.nextInt();
        System.out.println("Enter the Rate value: ");
        int RV = input.nextInt();
        float simpleInterest = ((PV * TV * RV)/100f);
        System.out.println(simpleInterest + "%");

////        Question No 4: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double result;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
            return;
        }
        System.out.println("Result: " + result);

////        Question No5: Take 2 numbers as input and print the largest number.
        System.out.println("Enter number 1: ");
        int no1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int no2 = input.nextInt();
        if (no1>no2){
            System.out.println("The largest number is: " + no1);
        }else if (no2>no1){
            System.out.println("The largest number is: " + no2);
        }else{
            System.out.println("You entered invalid character");
        }

////        Question No6: Input currency in rupees and output in USD.
        System.out.println("Rupee to USD calculator");
        System.out.print("Enter the currency in rupees:  ");
        double rupee = input.nextDouble();
        double money = rupee * 0.012;
        System.out.println(rupee + " in USD is " + money);

////       Question No 7: To calculate Fibonacci Series up to n numbers.
        System.out.println("Enter the number" );
        int n = input.nextInt();
        int a = 0, b = 1;
        System.out.println("First " + n + " Fibonacci Numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }

        // 2nd Method

        long[] fibonacciSeries = new long[n];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        System.out.println("Fibonacci Sequence (Iterative):");
        for (long num : fibonacciSeries) {
            System.out.print(num + " ");
        }

    }
}