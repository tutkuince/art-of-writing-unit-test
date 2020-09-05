package com.muditasoft.artofwritingunittest.sample01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void test_addition() {
        // on hazirlik
        Calculator calculator = new Calculator();
        int number1 = 5;
        int number2 = 19;

        // methodu calistir
        final int addition = calculator.addition(number1, number2);

        // sonucu kontrol et
        assertEquals(24, addition);
    }
}