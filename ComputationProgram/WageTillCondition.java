package ComputationProgram;

import java.util.Random;

public class WageTillCondition {

    // Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program with Condition Check");

        // Trackers
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        Random random = new Random();

        // Loop until either working days or hours exceed limits
        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            totalWorkingDays++;

            // Random attendance: 0 = Absent, 1 = Full-Time, 2 = Part-Time
            int empCheck = random.nextInt(3);
            int workingHours = 0;

            switch (empCheck) {
                case 1: // Full-Time
                    workingHours = FULL_TIME_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Full-Time (8 hrs)");
                    break;

                case 2: // Part-Time
                    workingHours = PART_TIME_HOURS;
                    System.out.println("Day " + totalWorkingDays + ": Part-Time (4 hrs)");
                    break;

                default: // Absent
                    workingHours = 0;
                    System.out.println("Day " + totalWorkingDays + ": Absent (0 hrs)");
            }

            // Ensure total hours doesn't exceed max
            if (totalWorkingHours + workingHours > MAX_WORKING_HOURS) {
                workingHours = MAX_WORKING_HOURS - totalWorkingHours;
            }

            totalWorkingHours += workingHours;
            int dailyWage = workingHours * WAGE_PER_HOUR;
            totalWage += dailyWage;
        }

        // Summary
        System.out.println("\n--- Monthly Wage Summary ---");
        System.out.println("Total Working Days  : " + totalWorkingDays);
        System.out.println("Total Working Hours : " + totalWorkingHours);
        System.out.println("Total Monthly Wage  : $" + totalWage);
    }
}

