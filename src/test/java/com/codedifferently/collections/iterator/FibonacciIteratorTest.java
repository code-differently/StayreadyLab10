package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciIteratorTest {

    FibonacciIterator fib;
    @Before
    public void initialize() {
        fib = new FibonacciIterator();
    }

    @Test
    public void hasNextTest() {
        // Given
        // Fibonacci always has next (true)

        // When
        boolean actual = fib.hasNext();

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void nextFirstFibTest() {
        // Given
        int expected = 0;

        // When
        int actual = fib.next();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nextSecondFibTest() {
        // Given
        int expected = 1;

        // When
        fib.next();
        int actual = fib.next();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nextTenthFibTest() {
        // Given
        int expected = 55;

        // When
        int actual = 0;
        for(int i = 0; i < 10; i++)
            actual = fib.next();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
