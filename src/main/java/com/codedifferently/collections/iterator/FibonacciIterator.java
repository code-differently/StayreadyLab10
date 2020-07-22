package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator {

    int a = 0;

    public boolean hasNext() {
        return true;
    }

    public Object next() {
        return FibonacciSequence(a + 1);
    }

    public int FibonacciSequence(int a){
        if (a <= 1){
            return a;
        }
       return  FibonacciSequence(a-1) + FibonacciSequence(a-2);

    }
}
