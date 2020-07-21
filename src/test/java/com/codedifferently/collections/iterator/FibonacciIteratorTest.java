package com.codedifferently.collections.iterator;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class FibonacciIteratorTest 
{
    FibonacciIterator fib;
    Iterator <Integer> iter;

    @Before
    public void starter()
    {
        fib = new FibonacciIterator();
    }

    @Test
    public void testFibonacci()
    {
        //given
        Integer actual = 0;
        Integer expected = 2;

        //when
        for (int i = 0; i < 2; i++)
         {
            if(fib.hasNext())
            {
                actual = fib.next();
            }
        }
        //then
        assertEquals(expected, actual);
    }   

}
