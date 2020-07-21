package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator {
    int prev = 0;
    int current = 1;
    int next = 0;

    public boolean hasNext() {
        return true;
    }

    public Object next() {
        next = prev + current;
        prev = current;
        current = next;
        return next;
    }

    public void remove() {

    }

    public Object fib (int n) {
        Object val = 0;
        for (int i = 0; i < n - 1; i++) {
            val = next();
        }
        return val;
    }


}
