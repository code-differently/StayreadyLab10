package com.codedifferently.collections.iterator;

import java.beans.IntrospectionException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIteratorTest {
    @Test
    public void fibonnacciTest()
    {
        //Given
        FibonacciIterator fibonacciIterator = new FibonacciIterator();
        Integer number = 9;
        //When 
        Integer expected = 34; 
        Integer actual = fibonacciIterator.fibonnacci(number);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void nextTest()
    {
        //Given
        ArrayList<Object> arrayList = new ArrayList<Object>();
        FibonacciIterator fibonacciIterator = new FibonacciIterator();
        //When
        for(int i = 0; i<5; i++)
        {
            arrayList.add(fibonacciIterator.next());
            fibonacciIterator.number ++;
        }
        ArrayList<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);

        ArrayList<Object> actual = arrayList;
        //Then 
        Assert.assertEquals(expected, actual);

        
    }
}
