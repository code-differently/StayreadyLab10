package com.codedifferently.collections.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class FibonacciIterator implements Iterator {
    private static int whichIteration = 0;
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        whichIteration++;
        return whichIteration;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }

    public static int getWhichIteration() {
        return whichIteration;
    }

    public static void setWhichIteration(int whichIteration) {
        FibonacciIterator.whichIteration = whichIteration;
    }
}
