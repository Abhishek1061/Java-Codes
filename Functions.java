import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Question 1: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        /*
        System.out.println("please enter first number");
        int first = in.nextInt();
        System.out.println("please enter second number");
        int second = in.nextInt();
        System.out.println("please enter third number");
        int third = in.nextInt();

        int largest = largest(first,second, third);
        int smallest = smallest(first,second,third);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest);
        System.out.printf("largest of three numbers %d, %d, and %d is :%d %n", first, second, third, smallest);
         */


        //Question 2:Define a program to find out whether a given number is even or odd.
        /*
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        OddEven(n);
        */

        //Question 3: A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        /*
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        EligibleToVote(age);
        */

        //Question 4:  Write a program to print the sum of two numbers entered by user by defining your own method.
        /*
        System.out.print("Enter the number 1: ");
        int a = in.nextInt();
        System.out.print("Enter the number 2: ");
        int b = in.nextInt();
        Sum(a,b);
        */

        //Question 5: Define a method that returns the product of two numbers entered by user.
        /*
        System.out.print("Enter the number 1: ");
        int a = in.nextInt();
        System.out.print("Enter the number 2: ");
        int b = in.nextInt();
        Multiplication(a,b);
        */

        //Question 6: Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        /*
        System.out.print("Enter the radius: ");
        double r = in.nextDouble();
        Area(r);
        Circumference(r);
         */

        //Question 7: Define a method to find out if a number is prime or not.
        /*
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println(IsPrime(n));
         */

        //Question 8: Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        /*
        System.out.println("Enter the Marks: ");
        int marks = in.nextInt();
        displayGrades(marks);
         */

        //Question 9: Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
        /*
        System.out.println("Enter a number to find its factorial: ");
        int number = in.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = Factorial(number);
            System.out.println( number + "!" + " = " +  factorialExpression(number) + " = " + result);
        }
         */

        //Question 10: Write a function to find if a number is a palindrome or not. Take number as parameter.
        /*
        System.out.println("Enter th Number: ");
        int num = in.nextInt();

        if (isPalindrome(num)){
            System.out.println(num + " is a palindrome.");
        }else {
            System.out.println(num + "is not a palindrome");
        }
         */

        //Question 12: Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
        /*
        int arr[] = { 3, 1, 4, 6, 5 };
        int ar_size = arr.length;
        if (isTriplet(arr, ar_size) == true) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
         */

         //Question 13:Write a function that returns all prime numbers between two given numbers.
        /*
        System.out.print("Enter th Number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter th Number 2: ");
        int num2 = in.nextInt();
        System.out.printf("Prime numbers between %d and %d are: ", num1, num2  );
        PrimeNumbers(num1,num2);
         */

        //Question 14: Write a function that returns the sum of first n natural numbers.
        System.out.println("Enter the first n natural number value: ");
        int num = in.nextInt();
        System.out.println("The sum of 1st n natural number is: " + naturalNumber(num));


    }

    static long naturalNumber(int num) {
        int sum = 0;
        for(int i =1 ; i<= num; i++){
          sum = sum + i;

        }return sum;
    }

    static void PrimeNumbers(int a, int b){
        int flag;
        for(int i = a ; i<=b; i++){
            if(i <= 1 )
                continue;
            flag = 1;
            for(int j = 2; j <= Math.sqrt(i); ++j ){
                if( i% j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                System.out.print(i + ", " );
        }
    }


    static boolean isTriplet(int arr[], int n){
        for(int i =0; i< n; i++){
            for(int j = i +1; j< n; j++){
                for(int k = j+1; k< n; k++){
                    int x = arr[i]* arr[i], y =arr[j] *arr[j], z=arr[k] * arr[k];
                    if(x == y +z || y == x +z || z == y + z)
                        return true;
                }
            }
        }
        return false;
    }
    static boolean isPalindrome(int n){
        int originalNumber = n;
        int reverseNumber = 0;

        while (n > 0) {
            int digit = n % 10;
            reverseNumber = reverseNumber * 10 + digit;
            n /= 10;
        }
        return originalNumber == reverseNumber;
    }

    static String factorialExpression(int n){
        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            expression.append(i);
            if (i<n){
                expression.append(" * ");
            }
        }return expression.toString();
    }

    static long Factorial(int n){
        if (n == 0 || n ==1){
            return 1;
        }else{
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }

    static void displayGrades(int marks){
        String grade;
        if (marks >=91 && marks <=100){
            grade = "AA";
        }else if  (marks >=81 && marks <=90) {
            grade = "AB";
        }else if  (marks >=71 && marks <=80) {
            grade = "BB";
        }else if  (marks >=61 && marks <=70) {
            grade = "BC";
        }else if  (marks >=51 && marks <=60) {
            grade = "CD";
        }else if  (marks >=41 && marks <=50) {
            grade = "DD";
        }else if  (marks <=40) {
            grade = "Fail";
        }else {
            System.out.println("Invalid marks. Marks should be between 0 and 100.");
            return;
        }
        System.out.println("Your grade is: " + grade);
    }


    static boolean IsPrime(int n) {
        if(n <= 1){
            return false;
        }
        for(int i = 2 ; i<= Math.sqrt(n); i++ ){
            if( n % i == 0 ){
                return false;
            }
        }
        return true;
    }

    static void Circumference(double r) {
        double Circumference = 2*r*Math.PI;
        System.out.println("Circumference of the circle is: " + Circumference );
    }

    static void Area(double radius) {
        double areaC = radius*radius*Math.PI;
        System.out.println("Area of the circle is: " + areaC );
    }

    static void Multiplication(int a, int b){
        int product = a * b  ;
        System.out.printf("The product of %d and %d is: %d %n ", a, b, product);
    }

    static void Sum(int a, int b){
        int sum = a + b  ;
        System.out.printf("The sum of %d and %d is: %d %n ", a, b, sum);
    }

    static void EligibleToVote(int age) {
        if( age >= 18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }

    static void OddEven(int n){
        if (n % 2 ==0 ){
            System.out.println("Even");
        }else if (n % 2 != 0){
            System.out.println("Odd");
        }else{
            System.out.println("Invalid Input");
        }
    }

    static int largest(int first, int second, int third){
        int max  = first;
        if(second> max){
            max =second;
        }
        if(third > max){
            max = third;
        }
        return max;

    }
    static int smallest(int first, int second, int third){
        int min = first;
        if (second < min) {
            min = second;
        }

        if (third < min) {
            min = third;
        }

        return min;
    }
}

