package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FibonacciIteratorTest {
    FibonacciIterator fb;
    @Before
    public void setUp(){
        this.fb= new FibonacciIterator();
    }
    @Test
    public void hasNext(){
        boolean actual = fb.hasNext();

        Assert.assertTrue(actual);

    }
    @Test
    public void nextTest(){
        //expected sum of fibonnaci
        List<Integer> expected= new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);

        //When
        List<Integer> actual=new ArrayList<Integer>();
        // ask tariq cant put actual size ?
        for(int i=0; i<expected.size(); i++){
            actual.add(fb.next());
        }
        //Then
        Assert.assertEquals(expected,actual);

    }
}
