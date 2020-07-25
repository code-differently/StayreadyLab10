package com.codedifferently.collections.iterator;

import org.junit.*;


public class FibonacciIteratorTest {

  FibonacciIterator fb = new FibonacciIterator();

  @Test
  public void fibonacciTest(){
    //find the 5th fibonnaci number
    int expected = 5;

    int actual = fb.fibonacci(5);

    Assert.assertEquals(expected, actual);
  }

  @Test 
  public void fibonacciTest2(){
    //find the 8th fibonnaci number
    int expected = 21;

    int actual = fb.fibonacci(8);

    Assert.assertEquals(expected, actual);
  
  }

  @Test 
  public void fibonacciTest3(){
    //find the 8th fibonnaci number
    int expected = 0;

    int actual = fb.fibonacci(0);

    Assert.assertEquals(expected, actual);
  
  }

  @Test 
  public void fibonacciTest4(){
    //find the 8th fibonnaci number
    int expected = 2;

    int actual = fb.fibonacci(3);

    Assert.assertEquals(expected, actual);
  
  }


}
