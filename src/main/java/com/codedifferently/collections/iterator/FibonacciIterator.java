package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    int current = 1;
    int previous = 0;
    
    public boolean hasNext() {
        return true;
    }

    public Integer next() {
        int num = current + previous;
        previous = current;
        current = num;


        return num;
    }
}
