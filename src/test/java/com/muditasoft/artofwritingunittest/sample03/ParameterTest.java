package com.muditasoft.artofwritingunittest.sample03;

import com.muditasoft.artofwritingunittest.sample01.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterTest {

    Calculator calculator = new Calculator();

    private int wide;
    private int length;
    private int result;

    public ParameterTest(int wide, int length, int result) {
        this.wide = wide;
        this.length = length;
        this.result = result;
    }


    private static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {10, 2, 20},
                {20, 2, 40},
                {5, 2, 10},
                {25, 2, 50},
                {6, 2, 12}
        });
    }

    @ParameterizedTest(name = "#{index} - Run test with args={0}")
    @MethodSource("data")
    @Disabled
    void test_calculate_parameterized_square_meters() {
        assertEquals(result, calculator.calculateSquareMeters(wide, length));
    }
}
