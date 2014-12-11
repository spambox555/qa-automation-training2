package com.serg.bloim;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print("print some string"); //prints a string
        System.out.print(42);                  //prints a number
        System.out.println();
        System.out.println("Please, enter two numbers:"); //prints a string and breaks the line.

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();                  // here we read doubles from input
        double b = scanner.nextDouble();
        double sum = a + b;
        System.out.println("The sum is " + sum);
    }
}
