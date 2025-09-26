package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        // Declare userInput scanner object to store input data
        Scanner userInput = new Scanner(System.in);

        // Display system message requesting input of name
        System.out.println("Enter your name: ");

        // Store input in name variable
        String name = userInput.nextLine();

        // Print system message requesting input of hours worked
        System.out.println("Enter your hours worked (e.g 28.6): ");

        // Store input in hoursWorked variable
        float hoursWorked = userInput.nextFloat();

        // Print system message requesting input of pay rate
        System.out.println("Enter your pay rate (eg 18.15): ");

        // Store input in payRate variable
        float payRate = userInput.nextFloat();

        // Calculate and display gross pay with employees name
        if (hoursWorked > 40.0) {

            // Perform overtime logic
            float overTimeHours = hoursWorked - 40.0f;
            float grossPay = ((hoursWorked - overTimeHours) * payRate) + (overTimeHours * (payRate * 1.5f));

            System.out.printf("Hello %s, you have earned $%.2f this pay period.", name, grossPay);

        } else {

            // Perform regular hours logic
            float grossPay = hoursWorked * payRate;

            System.out.printf("Hello %s, you have earned $%.2f this pay period.", name, grossPay);

        }

    }

}
