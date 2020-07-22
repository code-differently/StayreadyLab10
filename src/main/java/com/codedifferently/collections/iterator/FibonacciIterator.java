package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int fib = 1;
    private int prevFib = 0;

    public boolean hasNext(){
        return true;
    }
    public Integer next(){
        int num = fib;
        fib += prevFib;
        prevFib = num;
        return fib;
     }
}

