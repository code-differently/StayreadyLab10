package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator <Integer>
{   
    private Integer num1;
    private Integer num2;
    private Integer sum;

    public  FibonacciIterator()
    {
        this.num1 = 0;
        this.num2 = 1;
    }

    public boolean hasNext() 
    {
        return true;
    }

    public Integer next() 
    {
        sum = num1 + num2;

        num1 = num2;

        num2 = sum;

        return sum;
    }
    
}
