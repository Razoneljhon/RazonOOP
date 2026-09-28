/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinalactivity;

/**
 *
 * @author Complab 3
 */
public class ElectricityBill {

    // Private properties
    private String accountNumber;
    private String customerName;
    private String customerType;
    private double previousReading;
    private double currentReading;

    // Constructor
    public ElectricityBill(String accountNumber, String customerName,
                           String customerType, double previousReading,
                           double currentReading) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public double getPreviousReading() {
        return previousReading;
    }

    public double getCurrentReading() {
        return currentReading;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public void setPreviousReading(double previousReading) {
        this.previousReading = previousReading;
    }

    public void setCurrentReading(double currentReading) {
        this.currentReading = currentReading;
    }

    // Calculate electricity consumption
    public double calculateConsumption() {
        return currentReading - previousReading;
    }

    // Get electricity rate
    public double getRate() {

        double consumption = calculateConsumption();

        if (customerType.equalsIgnoreCase("Residential")) {

            if (consumption <= 100) {
                return 10.00;
            } else if (consumption <= 200) {
                return 12.00;
            } else {
                return 15.00;
            }

        } else if (customerType.equalsIgnoreCase("Commercial")) {

            if (consumption <= 100) {
                return 15.00;
            } else if (consumption <= 200) {
                return 18.00;
            } else {
                return 22.00;
            }
        }

        return 0.00;
    }

    // Calculate total electricity bill
    public double calculateBill() {
        return calculateConsumption() * getRate();
    }

    // Get consumption classification
    public String getClassification() {

        double consumption = calculateConsumption();

        if (consumption < 100) {
            return "Low Consumption";
        } else if (consumption <= 200) {
            return "Moderate Consumption";
        } else {
            return "High Consumption";
        }
    }

    // Display electricity bill
    public void displayBill() {

        System.out.println("===== ELECTRICITY BILL =====");
        System.out.println();

        System.out.println("Account Number: " + accountNumber);
        System.out.println();

        System.out.println("Customer Name: " + customerName);
        System.out.println();

        System.out.println("Customer Type: " + customerType);
        System.out.println();

        System.out.println("Previous Reading: " + previousReading);
        System.out.println();

        System.out.println("Current Reading: " + currentReading);
        System.out.println();

        System.out.println("Consumption: " + calculateConsumption() + " kWh");
        System.out.println();

        System.out.printf("Rate: ₱%.2f%n", getRate());
        System.out.println();

        System.out.printf("Total Bill: ₱%.2f%n", calculateBill());
        System.out.println();

        System.out.println("Classification: " + getClassification());

        // Additional condition
        if (calculateConsumption() > 300) {
            System.out.println();
            System.out.println("WARNING: VERY HIGH ELECTRICITY CONSUMPTION");
        }

        System.out.println();
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Object 1
        ElectricityBill bill1 = new ElectricityBill(
            "EL-1001",
            "Juan Santos",
            "Residential",
            1250,
            1475
        );

        // Object 2
        ElectricityBill bill2 = new ElectricityBill(
            "EL-1002",
            "Maria Cruz",
            "Residential",
            2000,
            2120
        );

        // Object 3
        ElectricityBill bill3 = new ElectricityBill(
            "EL-1003",
            "ABC Company",
            "Commercial",
            3000,
            3350
        );

        // Display all bills
        bill1.displayBill();
        bill2.displayBill();
        bill3.displayBill();
    }
}

