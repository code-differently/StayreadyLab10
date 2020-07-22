package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer>{
   Integer current = 0, previous = 1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        Integer temp = previous;
        previous += current;
        current = temp;
        return temp;
    }

    @Override
    public void remove() {

    }


}
