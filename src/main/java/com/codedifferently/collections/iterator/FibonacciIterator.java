package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FibonacciIterator implements Iterator {

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

    // Your boy needs helppppppppp
    // help a brotha out
    // HOW DOES A BASTARD, ORPHAN, SON OF A WHORE, AND A SCOTSMAN
    // DROPPED IN THE MIDDLE OF A FORGOTTEN SPOT IN THE CARRIBEAN

//    public static int fibo(int n) {
//        if(n <= 1){
//            return n;
//        }
//        return fibo(n - 2) + fibo(n - 1);
//    }

}
