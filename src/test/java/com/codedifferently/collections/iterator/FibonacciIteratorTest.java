package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIteratorTest {

    FibonacciIterator fib = new FibonacciIterator();

    @Test
    public void hasNextTest(){
        Assert.assertTrue(fib.hasNext());
    }

    @Test
    public void nextTest(){
        Integer actual = 0;
        for(int i=0;i<5; i++)
            actual = fib.next();

        Integer expected = 8;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){

    }
}
