package com.codedifferently.collections.iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

  private int firstElement;
  private int secondElement;

  FibonacciIterator(){
    this.firstElement = 0; 
    this.secondElement = 1; 
  
  }

  public boolean hasNext() {
    return true;
  }

  public Integer next() {
    int sum = firstElement + secondElement;
    firstElement = secondElement; 
    secondElement = sum; 
    return sum;
  }
  
  
  public void remove(){
    throw new UnsupportedOperationException("Error! Don't do this Please!");
  }

  public Iterator<Integer> iterator(){
    return new FibonacciIterator();
  }

  //Calculating the fibonacci number 
  public Integer fibonacci(int n){
    Integer fib = 0;
    for(int i = 1; i < n; i++){
      fib = next();
    }
    return fib;

  }


}
