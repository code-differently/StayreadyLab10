package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.BadPaddingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FibonacciIteratorTest {

    FibonacciIterator aFibonacciIterator;
    @Before
    public void setup(){
        this.aFibonacciIterator = new FibonacciIterator();
    }

    @Test
    public void hasNextTest(){
        // Given
        boolean expected = true;

        // When
        boolean actual = aFibonacciIterator.hasNext();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nextTest(){
        // Given
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(13);
        list.add(21);
        list.add(34);

        // When
        List<Integer> actualList = new ArrayList<Integer>();
        for(int index = 0; index < list.size(); index++){
            actualList.add(aFibonacciIterator.next());
        }

        // Then
        Assert.assertEquals(list, actualList);
    }
}
