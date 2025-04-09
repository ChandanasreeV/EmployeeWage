package ComputationProgram;

public class DailyEmployeeWage {

    // Constants (can be reused)
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;

    public static void main(String[] args) {

        // Display welcome message
        System.out.println("Welcome to Employee Wage Computation Program");

        // Calculate daily wage
        int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;

        // Print the result
        System.out.println("Wage per Hour       : $" + WAGE_PER_HOUR);
        System.out.println("Full Day Hours      : " + FULL_DAY_HOURS + " hours");
        System.out.println("Daily Employee Wage : $" + dailyWage);
    }
}

