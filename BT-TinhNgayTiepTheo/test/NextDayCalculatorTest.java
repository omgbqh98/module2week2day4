import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testNextDayCalculator0() {
        int nextDay = 1 ;
        int nextMonth = 3 ;
        int nextYear = 2020 ;
        int[] expected = {nextDay, nextMonth, nextYear};
        int[] result = NextDayCalculator.nextDayCalculator(29,2,2020);
        assertArrayEquals(expected,result);
    }
    @Test
    void testNextDayCalculator1() {
        int nextDay = 2 ;
        int nextMonth = 1 ;
        int nextYear = 2020 ;
        int[] expected = {nextDay, nextMonth, nextYear};
        int[] result = NextDayCalculator.nextDayCalculator(1,1,2020);
        assertArrayEquals(expected,result);
    }
    @Test
    void testNextDayCalculator2() {
        int nextDay = 1 ;
        int nextMonth = 3 ;
        int nextYear = 1998 ;
        int[] expected = {nextDay, nextMonth, nextYear};
        int[] result = NextDayCalculator.nextDayCalculator(30,2,1998);
        assertArrayEquals(expected,result);
    }
    @Test
    void testNextDayCalculator3() {
        int nextDay = 1 ;
        int nextMonth = 1 ;
        int nextYear = 1999 ;
        int[] expected = {nextDay, nextMonth, nextYear};
        int[] result = NextDayCalculator.nextDayCalculator(31,12,1998);
        assertArrayEquals(expected,result);
    }


    }
