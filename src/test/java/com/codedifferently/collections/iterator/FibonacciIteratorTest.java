package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FibonacciIteratorTest {

    @Test
    public void FibbonacciTest() {
        //Given
        FibonacciIterator iter = new FibonacciIterator();
        int count = 10;
        ArrayList l = new ArrayList();
        //When
        while (count > 0) {
            l.add(iter.next());
            count--;
        }
        ArrayList actual = l;
        ArrayList expected = new ArrayList();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(8);
        expected.add(13);
        expected.add(21);
        expected.add(34);
        expected.add(55);
        expected.add(89);


        //Then
        Assert.assertEquals(expected, actual);
    }
}
