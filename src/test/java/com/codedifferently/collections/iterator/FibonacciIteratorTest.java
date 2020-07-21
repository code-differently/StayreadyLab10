package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIteratorTest {
    FibonacciIterator fib;

    @Test
    public void hasNextTest() {
        fib = new FibonacciIterator();

        boolean actual = fib.hasNext();

        Assert.assertTrue(fib.hasNext());
    }

    @Test
    public void nextTest() {
        fib = new FibonacciIterator();

        Object expected = 1;
        Object actual = fib.next();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nextTest2() {
        fib = new FibonacciIterator();

        Object expected = 2;
        fib.next();
        Object actual = fib.next();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibTest() {
        fib = new FibonacciIterator();

        int index = 5;
        Object expected = 5 ;
        Object actual = fib.fib(index);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fibTest2() {
        fib = new FibonacciIterator();

        int index = 10;
        Object expected = 55;
        Object actual = fib.fib(index);

        Assert.assertEquals(expected, actual);
    }
}
