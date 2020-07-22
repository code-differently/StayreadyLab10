package com.codedifferently.collections.iterator;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciIteratorTest {
    FibonacciIterator fibi;

    @Before
    public void initialize() {
        fibi = new FibonacciIterator();
    }

    @Test
    public void NextFibonacciTest() {
        //Given
        int count = 5;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> expected = new ArrayList<Integer>();

        //When
        while (count > 0) {
            list.add(fibi.next());
            count--;
        }

        ArrayList<Integer> actual = list;

        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(8);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void hasNextTest(){
        //When
        fibi.next();
        fibi.next();

        boolean actual = fibi.hasNext();
        //Then
        Assert.assertEquals(true, actual);
    }

}
