package com.llt;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author LLT
 * @Date 2024-04-17-11:13
 **/
/*
TDD:
1. Write a fail test
2.Make the test pass
3.Refactor the code
 */
public class CalculatorTest {
    @Test
    public void shouldReturn2When1Plus1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, '+');
        int expectResult = 2;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void shouldReturn0When1Sub1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, '-');
        int expectResult = 0;
        Assert.assertEquals(expectResult, actualResult);
    }

}