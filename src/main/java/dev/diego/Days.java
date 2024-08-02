package dev.diego;

public class Days {
    private int[] daysList = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int numberOfDays(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        return daysList[month - 1];
    }
}
