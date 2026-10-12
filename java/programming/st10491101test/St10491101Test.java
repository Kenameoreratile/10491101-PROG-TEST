package programming.st10491101test;

import java.util.Scanner;

public class St10491101Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] products = {"COFFEE", "TEA", "BOBA TEA"};

        double[][] sales = new double[3][3];

        System.out.println("NUMBER 1 COFFEE NUT APPLICATION");
        System.out.println("------------------------------------------------------------------");

        // Input
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < products.length; j++) {
                System.out.print("Enter the number of " + products[j] + " sales for " + cities[i] + ": ");
                sales[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("NUMBER 1 COFFEE NUT REPORT");
        System.out.println("------------------------------------------------------------------");

        System.out.printf("%-20s %-15s %-15s %-15s\n", "", "COFFEE", "TEA", "BOBA TEA");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-15.2f %-15.2f %-15.2f\n",
                    cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("PRODUCT SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------------");

        double grandTotal = 0;
        double[] cityTotals = new double[3];

        for (int i = 0; i < cities.length; i++) {
            double total = 0;
            for (int j = 0; j < products.length; j++) {
                total += sales[i][j];
            }
            cityTotals[i] = total;
            grandTotal += total;
            System.out.printf("%-20s R%.2f\n", cities[i], total);
        }

        System.out.println();
        System.out.printf("TOTAL SALES FOR CITIES: R%.2f\n", grandTotal);
        System.out.println("------------------------------------------------------------------");

        scanner.close();
    }
}