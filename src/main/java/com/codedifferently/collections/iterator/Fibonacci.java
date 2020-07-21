package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> 
{

    
    private class FibonacciIterator implements Iterator<Integer>
    {
            int start = 0;
            int end = 1;
        
        
        public boolean hasNext() 
        {
            // TODO Auto-generated method stub
            return true;
        }
        
        public Integer next() 
        {
            int value = start + end;
            start =  end;
            end = value;
            return value;
        }

    

    }

    public Iterator<Integer> iterator() 
    {
        // TODO Auto-generated method stub
        return new FibonacciIterator();
    }
}
