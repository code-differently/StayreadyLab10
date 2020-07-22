package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIteratorTest {

    @Test
    public void FibonacciTest(){
        FibonacciIterator it = new FibonacciIterator();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        int count = 10;

        while(count > 0){
            actual.add(it.next());
            count--;
        }
        
        ArrayList<Integer> expected = new ArrayList<Integer>();
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

        Assert.assertEquals(expected, actual);
    }
}
