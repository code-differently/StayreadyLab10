package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    int a = 1;
    int b = 0;
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int temp = a;
        a = a + b;
        b = temp;
        return temp;
    }
}
