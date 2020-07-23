package com.codedifferently.collections.iterator;

import org.junit.Test;
import org.junit.Assert;


public class FibonacciIteratorTest {
    //hasNextTest()
    @Test
    public void nextTest(){
        int current = 1;
        int prev = 0;
        FibonacciIterator tester = new FibonacciIterator();
        int actual = tester.next();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void hasNextTest(){
        FibonacciIterator tester = new FibonacciIterator();
        Assert.assertTrue(tester.hasNext());
    }
}
