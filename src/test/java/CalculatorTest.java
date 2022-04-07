import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculate calc = new Calculate();

    @Test
    @DisplayName("Test add-method 2 +2 = 4")
    void twoPlusTwoEqualsFour(){
        assertEquals(4, calc.add(2,2), "2 + 2 should equal 4" );
    }

    @Test
    @DisplayName("Test add-method 3 + 5 = 8")
    void threePlusFiveEqualsEight(){
        assertEquals(8, calc.add(3,5), "3 + 5 should equal 8" );
    }

    @Test
    @DisplayName("Test subtract-method 10 - 5 = 5")
    void tenMinusFiveEqualsFive(){
        assertEquals(5,calc.subtract(10,5), "10 - 5 should equal 5");
    }

    @Test
    @DisplayName("Test subtract-method 8 - 7 = 1")
    void eightMinusSevenEqualsOne(){
        assertEquals(1,calc.subtract(8,7), "8 - 7 should equal 1");
    }

    @Test
    @DisplayName("Test multiply-method 2 * 8 = 16")
    void twoTimesEightEqualsSixteen(){
        assertEquals(16,calc.multiply(2,8), "2 * 8 should equal 16");
    }

    @Test
    @DisplayName("Test multiply-method 5 * 5 = 25")
    void fiveTimesFiveEqualsTwentyFive(){
        assertEquals(25,calc.multiply(5,5), "5 * 5 should equal 25");
    }

    @Test
    @DisplayName("Test divide-method 10 / 5 = 2")
    void tenDividedWithFiveEqualsTwo(){
        assertEquals(2,calc.divide(10,5), "10 / 5 should equal 2");
    }

    @Test
    @DisplayName("Test divide-method 4 / 8 = 0.5")
    void fourDividedWithEightEqualsZeroPointFive(){
        assertEquals(0.5,calc.divide(4,8), "4/ 8 should equal 0.5");
    }
}
