package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class FibonacciIteratorTest {

    FibonacciIterator fib;
    Iterator<Integer> iterator;
    @Before
    public void setUp(){
        fib=new FibonacciIterator();
    }

    @Test
    public void test1(){
        // Given
        int expected=8;
        int actual=0;

        // When
        for (int i = 0; i <5 ; i++) {
            if(fib.hasNext())
                actual=fib.next();
        }

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test2(){
        // Given
        int expected=2;
        int actual=0;

        // When
        for (int i = 0; i <2 ; i++) {
            if(fib.hasNext())
                actual=fib.next();
        }

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test3(){
        // Given
        int expected=46368;
        int actual=0;

        // When
        for (int i = 0; i <23 ; i++) {
            if(fib.hasNext())
                actual=fib.next();
        }

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void test4(){
        // Given
        int expected=317811;
        int actual=0;

        // When
        for (int i = 0; i <27 ; i++) {
            if(fib.hasNext())
                actual=fib.next();
        }

        // Then
        Assert.assertEquals(expected,actual);

    }


}
