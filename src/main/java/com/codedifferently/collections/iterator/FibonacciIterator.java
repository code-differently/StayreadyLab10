package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator {

    int a = 0;
    int b = 1;

    public boolean hasNext() {
        return true;
    }

    public Integer next() {
        int c;
        c = a+b;
        a = b;
        b = c;
        return c;
    }

    public void remove() {

    }
}
