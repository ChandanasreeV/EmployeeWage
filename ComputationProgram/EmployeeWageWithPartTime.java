package ComputationProgram;

public class EmployeeWageWithPartTime {

    // Constants
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 8; // You can change to 4 later if needed

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Welcome to Employee Wage Computation Program");

        // Calculate wages
        int fullTimeWage = WAGE_PER_HOUR * FULL_TIME_HOURS;
        int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOURS;

        // Display wage details
        System.out.println("\n--- Full-Time Employee ---");
        System.out.println("Wage per Hour       : $" + WAGE_PER_HOUR);
        System.out.println("Working Hours       : " + FULL_TIME_HOURS);
        System.out.println("Daily Wage          : $" + fullTimeWage);

        System.out.println("\n--- Part-Time Employee ---");
        System.out.println("Wage per Hour       : $" + WAGE_PER_HOUR);
        System.out.println("Working Hours       : " + PART_TIME_HOURS);
        System.out.println("Daily Wage          : $" + partTimeWage);
    }
}
