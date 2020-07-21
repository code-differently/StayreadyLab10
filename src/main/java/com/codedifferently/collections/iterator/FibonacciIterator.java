package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator {

    int prev = 0;
    int curr = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int temp = curr;
        curr = prev + curr;
        prev = temp;
        return temp;
    }
}
