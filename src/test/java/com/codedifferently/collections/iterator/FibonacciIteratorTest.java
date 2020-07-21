package com.codedifferently.collections.iterator;

import com.codedifferently.collections.iterator.Fibonacci;

import org.junit.Test;

public class FibonacciIteratorTest 
{
   public static void main(String [] args)
   {
    Fibonacci fib = new Fibonacci();
    for (int i : fib) 
    {
      if (i > 40) //To set the limit of the Fibonacci so it doesn't crash
      {
         break;
      }
    System.out.print(i + " ");
    }
    System.out.print("\n");
   }
}
