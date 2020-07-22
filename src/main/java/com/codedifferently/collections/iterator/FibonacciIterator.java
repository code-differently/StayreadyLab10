package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    Collection<Integer> c = new ArrayList();
    Iterator<Integer> iter = c.iterator();
    Integer current=0, previous=1;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next(){

           Integer temp = previous;
            previous += current;
            current = temp;
            return temp;
        }

}
