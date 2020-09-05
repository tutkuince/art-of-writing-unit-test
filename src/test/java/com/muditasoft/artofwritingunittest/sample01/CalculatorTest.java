package com.muditasoft.artofwritingunittest.sample01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void test_addition() {
        // GIVEN
        int number1 = 5;
        int number2 = 19;

        // WHEN
        final int addition = calculator.addition(number1, number2);

        // THEN
        assertEquals(24, addition);
    }

    @Test
    void test_substitution() {
        assertEquals(9, calculator.substitution(19, 10));
    }

    @Test
    void when_number_substitution_from_zero_expect_negative_number() {
        assertEquals(-19, calculator.substitution(0, 19));
    }

    @Test
    void when_number_substitution_from_zero_number_expect_number_is_same_as_before() {
        assertEquals(10, calculator.substitution(10, 0));
    }
}