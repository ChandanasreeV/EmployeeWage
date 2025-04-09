package ComputationProgram;

public class MonthlyEmployeeWage {

    // Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int WORKING_DAYS_IN_MONTH = 20;

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Welcome to Employee Wage Computation Program");

        // Step 1: Calculate daily wage
        int dailyWage = WAGE_PER_HOUR * FULL_TIME_HOURS;

        // Step 2: Calculate monthly wage = daily wage * working days
        int monthlyWage = dailyWage * WORKING_DAYS_IN_MONTH;

        // Display results
        System.out.println("\n--- Employee Monthly Wage Details ---");
        System.out.println("Wage per Hour        : $" + WAGE_PER_HOUR);
        System.out.println("Full-Time Hours/Day  : " + FULL_TIME_HOURS);
        System.out.println("Working Days/Month   : " + WORKING_DAYS_IN_MONTH);
        System.out.println("Daily Wage           : $" + dailyWage);
        System.out.println("Monthly Wage         : $" + monthlyWage);
    }
}

