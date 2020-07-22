package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer>{

    Integer next = 1;
    Integer previous = 0;

    public boolean hasNext() {
        // TODO Auto-generated method stub
        return true;
    }
    Integer num1 = 0;
    Integer num2 = 1;
    Integer sumOfPrevTwo = 0;

    public Integer next() {
        // TODO Auto-generated method stub
        
        
        int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        return sumOfPrevTwo;
    }
    
    
}