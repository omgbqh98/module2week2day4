import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testNextDayCalculator0() {
//        int day = 2;
        int expected = 1;

        int result = NextDayCalculator.nextDayCalculator(0);
        assertEquals(expected, result);
    }

    @Test
    void testNextDayCalculator1() {
        int expected = 2;

        int result = NextDayCalculator.nextDayCalculator(1);
        assertEquals(expected, result);
    }
}