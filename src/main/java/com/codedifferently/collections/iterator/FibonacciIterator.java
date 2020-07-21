package com.codedifferently.collections.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class FibonacciIterator implements Iterator {

    private int n1 = 0;
    private int n2 = 1;
    private int n3;

    public boolean hasNext() {
        return true;
    }

    public Integer next() {
        int ret;

        if(n1 == 0) {
            ret = 0;
        } else if(n2 == 1) {
            ret = 1;
        } else {
            ret = n3;
        }

        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;

        return ret;
    }

    public void remove() {

    }

    public void forEachRemaining(Consumer action) {

    }

}
