package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FibonacciIterator implements Iterator<Integer> {
    private int a = 0, b = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int val = a + b;
        a = b;
        b = val;
        return val;
    }

}
