package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        // declare userInput scanner object to store input data
        Scanner userInput = new Scanner(System.in);

        // display system message requesting input of name
        System.out.println("Enter your name: ");

        // store input in name variable
        String name = userInput.nextLine();

        // print system message requesting input of hours worked
        System.out.println("Enter your hours worked (e.g 28.6): ");

        // store input in hoursWorked variable
        double hoursWorked = userInput.nextFloat();

        // print system message requesting input of pay rate
        System.out.println("Enter your pay rate (eg 18.15): ");

        // store input in payRate variable
        double payRate = userInput.nextFloat();

        // calculate and display gross pay with employees name
        if (hoursWorked > 40.0) {

            // perform overtime calculation
            double overTimeHours = hoursWorked - 40.0;
            double grossPay = ((hoursWorked - overTimeHours) * payRate) + (overTimeHours * (payRate * 1.5));

            System.out.printf("Hello %s, you have earned $%.2f this pay period.", name, grossPay);

        } else {

            // perform regular hours calculation
            double grossPay = hoursWorked * payRate;

            System.out.printf("Hello %s, you have earned $%.2f this pay period.", name, grossPay);

        }

    }

}
