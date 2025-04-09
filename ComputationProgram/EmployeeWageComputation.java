package ComputationProgram;

import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class EmployeeWageComputation {

    // Class Variable
    static String companyName = "ABC Corp";

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Asking how many employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Loop to get employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Rate per Hour: ");
            int ratePerHour = scanner.nextInt();

            System.out.print("Working Days: ");
            int workingDays = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Create Employee object and add to list
            Employee emp = new Employee(name, ratePerHour, workingDays);
            employeeList.add(emp);
        }

        // Display all employee wages
        System.out.println("\n--- Monthly Wages ---");
        for (Employee emp : employeeList) {
            System.out.println("Employee: " + emp.name);
            System.out.println("Monthly Wage: $" + emp.calculateMonthlyWage());
            System.out.println("----------------------");
        }

        // Close scanner
        scanner.close();
    }
}

// Employee class with instance variables and methods
class Employee {
    String name;
    int ratePerHour;
    int workingDays;

    // Constructor
    Employee(String name, int ratePerHour, int workingDays) {
        this.name = name;
        this.ratePerHour = ratePerHour;
        this.workingDays = workingDays;
    }

    // Method to calculate monthly wage
    int calculateMonthlyWage() {
        int workingHoursPerDay = 8; // assuming 8 hours/day
        return workingHoursPerDay * workingDays * ratePerHour;
    }
}
