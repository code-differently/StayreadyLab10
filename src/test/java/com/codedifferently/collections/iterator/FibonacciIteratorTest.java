package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciIteratorTest {
    FibonacciIterator test;
    String expected;
    String actual;

    @Before
    public void setUp(){

        test = new FibonacciIterator();
        expected = "";
        actual = "";
    }

    @Test
    public void nextTest() {
        expected = "11235";

        actual += test.next();
        actual += test.next();
        actual += test.next();
        actual += test.next();
        actual += test.next();

        Assert.assertEquals(expected, actual);

    }



}
