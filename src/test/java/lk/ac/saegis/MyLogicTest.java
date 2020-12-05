package lk.ac.saegis;

import logic.LuckyCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLogicTest {

    @Test
    void testLogic() {
        LuckyCalculator calculator = new LuckyCalculator();

        int result = calculator.calculateMyLuckyNumber("07-11-1994");

        assertEquals(5, result);

    }
}
