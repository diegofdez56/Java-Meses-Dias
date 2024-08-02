package dev.diego;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java App <month-number>");
            return;
        }
        
        int monthNumber;
        try {
            monthNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid month number (1-12)");
            return;
        }

        Month month = new Month();
        Days days = new Days();

        try {
            String monthName = month.monthName(monthNumber);
            int numberOfDays = days.numberOfDays(monthNumber);

            System.out.println("Month: " + monthName);
            System.out.println("Number of days: " + numberOfDays);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
