package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
        
        int fib = 1;
        int prevFib = 0;
        
        public boolean hasNext(){
            return true;
        }

        public Integer next(){
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
            return fib;
         }

        public void remove(){

        }
}
