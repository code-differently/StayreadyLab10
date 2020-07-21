package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIteratorTest
{
    @Test
    public void testTheSequence()
    {
        FibonacciIterator fib = new FibonacciIterator();

        int countValues = 0;
        int programSum = 0;
        while(fib.hasNext() && countValues < 6)
        {
            System.out.println(programSum += fib.next());

            countValues++;
        }

        int expectedSum = 20;

        Assert.assertEquals(expectedSum, programSum);
    }
}
