package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int num1;
    private int num2;

    public FibonacciIterator(){
        this.num1=0;
        this.num2=1;
    }


    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int total=num1+num2;
        num1=num2;
        num2=total;
        return total;
    }

}
