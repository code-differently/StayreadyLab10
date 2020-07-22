package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Object>{

    public Integer number = 0;

    public boolean hasNext() {
        return true;
    }

    public Object next() {

        return fibonnacci(number+1);
    }

    public Integer fibonnacci(Integer n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibonnacci(n-1) + fibonnacci(n-2); 
    }


}
