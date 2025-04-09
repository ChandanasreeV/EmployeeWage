package ComputationProgram;

import java.util.Scanner;

public class EmployeeWageSwitchCase {

    // Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 4; // Making part-time 4 to show the difference

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to Employee Wage Computation Program using Switch Case");

        // Show options to the user
        System.out.println("Enter Attendance Type:");
        System.out.println("0 - Absent");
        System.out.println("1 - Full-Time");
        System.out.println("2 - Part-Time");
        System.out.print("Your Choice: ");

        int attendance = scanner.nextInt(); // Get user input
        int workingHours = 0;

        // Switch case to determine working hours
        switch (attendance) {
            case 0:
                System.out.println("Employee is Absent.");
                workingHours = 0;
                break;

            case 1:
                System.out.println("Employee is Full-Time.");
                workingHours = FULL_TIME_HOURS;
                break;

            case 2:
                System.out.println("Employee is Part-Time.");
                workingHours = PART_TIME_HOURS;
                break;

            default:
                System.out.println("Invalid input! Please enter 0, 1, or 2.");
                return;
        }

        // Calculate and display wage
        int dailyWage = workingHours * WAGE_PER_HOUR;
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Daily Wage   : $" + dailyWage);

        scanner.close();
    }
}

