package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FibonacciIterator  implements Iterator<Integer> {



    private Collection<Integer> c;
    private Iterator<Integer> iter;
    private Integer current, previous;

    public FibonacciIterator (){
        c = new ArrayList();
        iter =  c.iterator();
        current = 0;
        previous = 1;
    }

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
