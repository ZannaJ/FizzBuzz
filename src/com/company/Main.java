package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that prints numbers 1-50
        // and if a number was divisible by 3 then replace it with Fizz
        // and if the number was divisible by 7 then replace it with Buzz
        // and if the number was divisible by both 7 and 3 then replace it with FizzBuzz
        // else just print the number.

        // continue:
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // continue jumps to the next iteration or repetition.
            }
//            System.out.println(i);
        }

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
//                System.out.println("FizzBuzz");
                continue;
            } else if (i % 7 == 0) {
//                System.out.println("Buzz");
                continue;
            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
                continue;
            }

//            System.out.println(i);
        }

        // Write a program calculate the x values of a quadratic equation.
        // (-b +- sqrt(b^2 - 4 * a * c)) / 2a
        // 2x^2 + 3x - 4 = 0
        // a      b    c
        //

        // 1. Collect our input
        // 2. Solve for the discriminant
        // 3. find the first x value(-ve)
        // 4. find the second x value(+ve)
        // 5. Output the result.

        // Get user input from the console
        // initialize the scanner. Scanner class/object allows us to receive input from the user.
        Scanner scanner = new Scanner(System.in);

        // get the value of a
//        System.out.print("Enter the value of a: ");
//        double a = scanner.nextDouble();

        // get the value of b
//        System.out.print("Enter the value of b: ");
//        double b = scanner.nextDouble();

        // get the value of c
//        System.out.print("Enter the value of c: ");
//        double c = scanner.nextDouble();

        // solve for the discriminant - (b^2 - 4 * a * c) // PEMDAS-
//        double discriminant = Math.pow(b, 2) - (4 * a * c);

        // if the discriminant is negative then exit the program
//        if (discriminant < 0) {
//            System.out.println("Discriminant is negative");
//            return;
//        }

        // solve for the first value of x
        // (-b + sqrt(discriminant)) / 2 * a
//        double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;

        // solve for the second value of x
        // (-b - sqrt(discriminant)) / 2 * a
//        double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;

        // output the results
//        System.out.println("The first value of x: " + x1);
//        System.out.println("The second value of x: " + x2);

        // Write a program that takes in the value of 8 children's
        // ages in an array,
        // and finds the average of those 8 kids
        // enter age:
        // enter age:
        // e.g. The average of the 8 kids is: ...

        //1. initialize scanner
        //2. get the size of the array.
        //3. create an array of that size
        //4. add the user's values to the array
        //5. Loop through and find the sum of the values
        //6. divide by the length. Note: average = sum of values/ number of values.

//        System.out.print("Enter the number of values you want to average: ");
        // get the size of the array & create an array of that size
//        int[] ages = new int[scanner.nextInt()];

        // add the user's values to the array
//        for(int i = 0; i < ages.length; i++) {
//            System.out.print("Enter the next age: ");
//            ages[i] = scanner.nextInt();
//        }

        // get the sum of the values
//        double sum = 0;
//        for (int i = 0; i < ages.length; i++) {
//            sum += ages[i];
//        }

        // print out the average of the ages
//        System.out.println("The average of the " + ages.length + " kids is: " + sum/ages.length);



        // Write a program that takes a set of values as an array
        // print out the values as a string like this [3, 5, 6, 3, 4]
        // make it as interactive as possible.

        System.out.print("Enter the number of numbers to print out:  ");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the next number: ");
            numbers[i] = scanner.nextInt();
        }

        String numberArray = "["; // Concatenating the values to this string.
        for(int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                numberArray += numbers[i] + ", ";
            } else {
                numberArray += numbers[i] + "]";
            }
        }

        System.out.println(numberArray);

    }

    // Write a program that takes a number n and calculates harmonic series from to 1 -n
    // e.g n = 5
    // Enter the value of n: 5
    // harmonic series formula : (1) + (1/2) + 1/3 + 1/4 + 1/5 ... + 1/n
    // The answer is : ...

    // Assignment
    // Write a program that takes a value from the user and
    // prints out that number's position in fibonacci sequence.
    // Fibonacci sequence is a series of numbers where the previous two numbers sum up
    // to make the next number.
    // In this case, take the first two numbers of the sequence to be 1, 1
    // e.g. 1, 1, 2, 3, 5, 8, ...
    // Enter the position you want: 4
    // 3

    // regular expressions in strings. 5abcd
    // sorting algorithms









}