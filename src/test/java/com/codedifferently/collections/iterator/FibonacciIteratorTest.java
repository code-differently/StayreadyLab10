package com.codedifferently.collections.iterator;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIteratorTest {

    @Test
    public void hasNextTest(){
        //Given
        FibonacciIterator fibIterator = new FibonacciIterator();

        //When
        boolean expected =  true;
        boolean actual = fibIterator.hasNext();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nextTest(){
        //Given
        FibonacciIterator fibIterator = new FibonacciIterator();

        //When
        LinkedList<Object> linkedList = new LinkedList<Object>();
        for (int i = 0; i < 5; i++) {
            linkedList.add(fibIterator.next());
            fibIterator.a++;
        }

        LinkedList<Object> expected =  new LinkedList<Object>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);

        //Then
        Assert.assertEquals(expected, linkedList);
    }

    @Test
    public void fibonacciSequenceTest(){
        //Given
        FibonacciIterator fibIterator = new FibonacciIterator();

        //When
        fibIterator.FibonacciSequence(9);
        int expected = 34;
        int actual = fibIterator.FibonacciSequence(9);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
