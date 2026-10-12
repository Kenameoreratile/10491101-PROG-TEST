/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming.st10491101test;

/**
 *
 * @author Student
 */
import java.util.Scanner;

interface IBeverage {
    String getBeverageType();
    String getCity();
    int getTotalSales();
}

abstract class Beverage implements IBeverage {
    protected String beverageType;
    protected String city;
    protected int totalSales;

    public Beverage(String beverageType, String city, int totalSales) {
        this.beverageType = beverageType;
        this.city = city;
        this.totalSales = totalSales;
    }

    @Override
    public String getBeverageType() {
        return beverageType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}

class BeverageSales extends Beverage {
    public BeverageSales(String beverageType, String city, int totalSales) {
        super(beverageType, city, totalSales);
    }

    public void printReport() {
        System.out.println();
        System.out.println("BEVERAGE SALES REPORT");
        System.out.println("*********************");
        System.out.println("BEVERAGE TYPE: " + getBeverageType());
        System.out.println("CITY: " + getCity());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}

// Main class - file name must be Question2.java
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the beverage type");
        System.out.println("1) COFFEE");
        System.out.println("2) TEA");
        System.out.println("3) BODA");
        System.out.println();

        String choice = scanner.nextLine().trim();
        String beverageType = "";

        switch (choice) {
            case "1": beverageType = "COFFEE"; break;
            case "2": beverageType = "TEA"; break;
            case "3": beverageType = "BODA"; break;
            default: beverageType = "COFFEE"; break;
        }

        System.out.print("Enter the city: ");
        String city = scanner.nextLine();

        System.out.print("Enter the total sales of " + beverageType + " beverages in " + city + ": ");
        int totalSales = Integer.parseInt(scanner.nextLine());

        BeverageSales sales = new BeverageSales(beverageType, city, totalSales);
        sales.printReport();

        scanner.close();
    }
}