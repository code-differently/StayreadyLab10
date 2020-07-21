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
        int expectedCount = 1;

        fibonacci.next();
        int actualCount = FibonacciIterator.getWhichIteration();

        Assert.assertEquals(expectedCount, actualCount);

    }
}
