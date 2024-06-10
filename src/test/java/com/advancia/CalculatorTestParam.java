package com.advancia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTestParam {

    @ParameterizedTest
    @MethodSource("addedNumbers")
    public void sumTest(int expected, int first, int second) {
        Calculator c = new Calculator();
        System.out.println("somma di " + first + " e " + second);
        assertEquals(expected, c.sum(first, second));
    }

    static Collection<Object[]> addedNumbers() {
        return Arrays.asList(new Object[][] {
                {3, 1, 2},
                {5, 2, 3},
                {7, 3, 4},
                {9, 4, 5}
        });
    }
}
