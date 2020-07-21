package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIteratorTest {

    @Test
    public void nextTest(){
        //Given
        FibonacciIterator fi = new FibonacciIterator();
        int index = 0;
        //When
        fi.next();
        fi.next();
        fi.next();
        index = fi.next();
        int expected = 3;
        int actual = index;
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasNextTest(){
        //Given
        FibonacciIterator fi = new FibonacciIterator();
        //When
        fi.next();
        fi.next();
        fi.next();
        boolean actual = fi.hasNext();
        //Then
        Assert.assertEquals(true, actual);
    }

}
