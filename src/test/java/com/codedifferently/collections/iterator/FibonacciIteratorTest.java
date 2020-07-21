package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FibonacciIteratorTest {

    FibonacciIterator test = new FibonacciIterator();

    @Test
    public void fibo() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);

        Assert.assertEquals(expected, test.fibo(3));


    }
    @Test
    public void next() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        Assert.assertEquals(expected.get(expected.size()-1), test.next());

    }
    @Test
    public void hasNext() {
        Assert.assertEquals(true, test.hasNext());

    }
}
