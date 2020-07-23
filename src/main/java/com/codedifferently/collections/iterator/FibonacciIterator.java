package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator {
    int current =  1;
    int prev = 0;
    @Override
    public boolean hasNext() {
        return true;
    }
    @Override
    public Integer next() {
        int temp = current;
        current = prev + current;
        prev = temp;
        return temp;
    }
}
