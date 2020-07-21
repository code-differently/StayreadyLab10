package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciIteratorTest {
    FibonacciIterator fibonacci;

    @Before
    public void setup() {
        fibonacci = new FibonacciIterator();
    }

    @Test
    public void hasNextTest() {
        boolean expected = true;

        boolean actual = fibonacci.hasNext();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {
        int expectedNumber = 8;

        fibonacci.next();
        fibonacci.next();
        fibonacci.next();
        fibonacci.next();
        Integer wrapperClassOfActualVal = (Integer) fibonacci.next();
        int actualNumber = wrapperClassOfActualVal.intValue();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void getFirstNumberTest() {
        int expected = 0;

        int actual = fibonacci.getFirstNumber();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstNumberTest() {
        int expected = 4;

        fibonacci.setFirstNumber(4);
        int actual = fibonacci.getFirstNumber();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondNumberTest() {
        int expected = 1;

        int actual = fibonacci.getSecondNumber();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSecondNumberTest() {
        int expected = 4;

        fibonacci.setSecondNumber(4);
        int actual = fibonacci.getSecondNumber();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCurrentSumTest() {
        int expected = 0;

        int actual = fibonacci.getCurrentSum();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentSumTest() {
        int expected = 6;

        fibonacci.setCurrentSum(6);
        int actual = fibonacci.getCurrentSum();

        Assert.assertEquals(expected, actual);
    }
}
