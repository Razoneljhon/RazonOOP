/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinalactivity;

/**
 *
 * @author Complab 3
 */
public class Employee {

    // Private properties
    private String employeeId;
    private String name;
    private String department;
    private int daysWorked;
    private double dailyRate;

    // Constructor
    public Employee(String employeeId, String name, String department,
                    int daysWorked, double dailyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    // Setters
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    // Calculate Regular Pay
    public double calculateRegularPay() {

        if (daysWorked <= 22) {
            return daysWorked * dailyRate;
        } else {
            return 22 * dailyRate;
        }
    }

    // Calculate Overtime Pay
    public double calculateOvertimePay() {

        if (daysWorked > 22) {
            int overtimeDays = daysWorked - 22;

            double overtimeDailyRate = dailyRate * 1.25;

            return overtimeDays * overtimeDailyRate;
        }

        return 0.00;
    }

    // Calculate Gross Pay
    public double calculateGrossPay() {
        return calculateRegularPay() + calculateOvertimePay();
    }

    // Calculate Deduction
    public double calculateDeduction() {

        double grossPay = calculateGrossPay();

        if (grossPay <= 15000) {
            return grossPay * 0.05;
        } else {
            return grossPay * 0.08;
        }
    }

    // Calculate Net Pay
    public double calculateNetPay() {
        return calculateGrossPay() - calculateDeduction();
    }

    // Get Attendance Classification
    public String getAttendanceClassification() {

        if (daysWorked < 15) {
            return "Poor Attendance";
        } else if (daysWorked <= 21) {
            return "Incomplete Attendance";
        } else if (daysWorked == 22) {
            return "Complete Attendance";
        } else {
            return "Overtime Worker";
        }
    }

    // Display Payroll
    public void displayPayroll() {

        System.out.println("===== EMPLOYEE PAYROLL =====");
        System.out.println();

        System.out.println("Employee ID: " + employeeId);
        System.out.println();

        System.out.println("Name: " + name);
        System.out.println();

        System.out.println("Department: " + department);
        System.out.println();

        System.out.println("Days Worked: " + daysWorked);
        System.out.println();

        System.out.printf("Daily Rate: ₱%.2f%n", dailyRate);
        System.out.println();

        System.out.printf("Regular Pay: ₱%.2f%n", calculateRegularPay());
        System.out.println();

        System.out.printf("Overtime Pay: ₱%.2f%n", calculateOvertimePay());
        System.out.println();

        System.out.printf("Gross Pay: ₱%.2f%n", calculateGrossPay());
        System.out.println();

        System.out.printf("Deduction: ₱%.2f%n", calculateDeduction());
        System.out.println();

        System.out.printf("Net Pay: ₱%.2f%n", calculateNetPay());
        System.out.println();

        System.out.println("Classification: " + getAttendanceClassification());

        System.out.println();
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Employee 1
        Employee employee1 = new Employee(
            "EMP-001",
            "Maria Cruz",
            "IT",
            25,
            700.00
        );

        // Employee 2
        Employee employee2 = new Employee(
            "EMP-002",
            "Juan Santos",
            "HR",
            22,
            650.00
        );

        // Employee 3
        Employee employee3 = new Employee(
            "EMP-003",
            "Ana Reyes",
            "Finance",
            18,
            600.00
        );

        // Display payroll
        employee1.displayPayroll();
        employee2.displayPayroll();
        employee3.displayPayroll();
    }
}
