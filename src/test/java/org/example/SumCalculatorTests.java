package org.example;

import org.junit.jupiter.api.*;

class SumCalculatorTests {
    SumCalculator calc;
    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
        SumCalculator.setResult(0);
    }

    @Test
    void testThatSumWorksCorrect_1() {
        int actual = calc.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testThatSumWorksCorrect_2() {
        int actual = calc.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testThatSumWorksCorrect_3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.sum(0));

    }
}
