package com.codedifferently.collections.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FibonacciIteratorTest {
    @Test
    public void fibTest(){
        int expected = 55;
        FibonacciIterator iter = new FibonacciIterator();
        int actual = 0;
        for (int i = 1; i < 10; i++) {
            actual = iter.next();
        }
        assertEquals(expected, actual);
    }
    @Test
    public void fibTest2(){
        List<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(2);
        fib.add(3);
        fib.add(5);
        fib.add(8);
        fib.add(13);
        fib.add(21);
        fib.add(34);
        fib.add(55);
        FibonacciIterator iter = new FibonacciIterator();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(iter.next());
        }
        assertEquals(fib, list);
    }
}
