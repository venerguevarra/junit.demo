package com.bootcamp.demo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator calculator;

    // fixtures
    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void should_return_sum_of_two_integer_numbers() {
        int actualResult = calculator.computeSum(10, 5);
        assertEquals(15, actualResult);
    }

    @Test
    public void should_return_sum_of_two_numbers_as_string() {
        int actualResult = calculator.computeSum("10", "10");
        assertEquals(20, actualResult);
    }

    @Test(expected = NumberFormatException.class)
    public void should_throw_number_format_exception_when_adding_non_numeric_values() {
        calculator.computeSum("a", "10");
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}
