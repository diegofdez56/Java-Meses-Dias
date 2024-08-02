package dev.diego;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    
    @Test
    public void testMonthName() {
        Month month = new Month();
        assertEquals("January", month.monthName(1));
        assertEquals("December", month.monthName(12));
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            month.monthName(0);
        });
        assertEquals("Month must be between 1 and 12", exception.getMessage());
        
        exception = assertThrows(IllegalArgumentException.class, () -> {
            month.monthName(13);
        });
        assertEquals("Month must be between 1 and 12", exception.getMessage());
    }

    @Test
    public void testNumberOfDays() {
        Days days = new Days();
        assertEquals(31, days.numberOfDays(1));
        assertEquals(28, days.numberOfDays(2));
        assertEquals(31, days.numberOfDays(12));
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            days.numberOfDays(0);
        });
        assertEquals("Month must be between 1 and 12", exception.getMessage());
        
        exception = assertThrows(IllegalArgumentException.class, () -> {
            days.numberOfDays(13);
        });
        assertEquals("Month must be between 1 and 12", exception.getMessage());
    }
}
