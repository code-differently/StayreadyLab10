package com.codedifferently.collections.iterator;


import java.util.ArrayList;
import java.util.Iterator;

public class FibonacciIterator implements Iterator {

   private ArrayList<Integer> arr = new ArrayList<>();
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {

        if(arr.size() > 1) {
            //have to -2 b/c an array starts at the 0th index
            arr.add(arr.get(arr.size() - 2) + arr.get(arr.size() - 1));

        }
        //these base cases are adding that first two starting elements of the fib seq.
        else if (arr.size() == 1){
            arr.add(1);
        }
        else if(arr.size() == 0) {
            arr.add(0);
        }

        return arr.get(arr.size()-1);
    }

    public ArrayList<Integer> fibo(int steps)
    {
        arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        int count = 0;
        while (count < steps)
        {
            arr.add(arr.get(count) + arr.get(count + 1));
            count++;
        }

        return arr;
    }
}