package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciIteratorTest {
    @Test
    public void fibTest(){
        //Given
        int expected = 34;
        //When
        FibonacciIterator iter = new FibonacciIterator();
        int actual = 0;
        for (int i = 0; i < 8; i++) {
            actual = iter.next();
        }
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void fiboTest(){
        //Given
        List<Integer> fib = new ArrayList<Integer>();
        fib.add(1);
        fib.add(2);
        fib.add(3);
        fib.add(5);
        fib.add(8);
        fib.add(13);
        fib.add(21);
        fib.add(34);

        //When
        FibonacciIterator iter = new FibonacciIterator();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {
            list.add(iter.next());
        }
        //Then
        Assert.assertEquals(fib, list);
    }

}
