package main;
import java.util.Scanner;


public class Main {
    public static void main(String[] metEnters) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit you want to convert from (feet, pounds, Fahrenheit): ");
        String fromUnit = input.nextLine();

        System.out.print("Enter the unit you want to convert to ( meters, kilograms, Celsius): ");
        String toUnit = input.nextLine();

        System.out.print("Enter the quantity to be converted: ");
        double quantity = input.nextDouble();

        // Conversion logic based on user input
        double result = 0.0;

        if (fromUnit.equalsIgnoreCase("feet") && toUnit.equalsIgnoreCase("meters")) {
            result = quantity * 0.3048; // 1 foot = 0.3048 meters
        } else if (fromUnit.equalsIgnoreCase("pounds") && toUnit.equalsIgnoreCase("kilograms")) {
            result = quantity * 0.453592; // 1 pound = 0.453592 kilograms
        } else if (fromUnit.equalsIgnoreCase("fahrenheit") && toUnit.equalsIgnoreCase("celsius")) {
            result = (quantity - 32) * 5 / 9;
        } else {
            System.out.println("Invalid conversion units. Please check your input.");
            return;
        }

        System.out.println("Conversion result: " + result + " " + toUnit);
    }
}
