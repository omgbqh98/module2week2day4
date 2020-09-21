import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testTraslate() {
        int number = 7;
        String expected = "number : " + number;

        String result = FizzBuzzTranslate.traslate(number);
        assertEquals(expected, result);
    }
}