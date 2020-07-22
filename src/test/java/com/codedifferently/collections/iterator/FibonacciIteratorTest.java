package com.codedifferently.collections.iterator;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIteratorTest {

    @Test 
    public void fibonacciIteratorTest(){
         //Given
         FibonacciIterator iter = new FibonacciIterator();
         int count = 10;
         ArrayList<Integer> l = new ArrayList<Integer>();
         //When
         while(count > 0){
             l.add(iter.next());
             count--;
         }
         ArrayList<Integer> actual = l;
         ArrayList<Integer> expected = new ArrayList<Integer>();
         expected.add(1);
         expected.add(2);
         expected.add(3);
         expected.add(5);
         expected.add(8);
         expected.add(13);
         expected.add(21);
         expected.add(34);
         expected.add(55);
         expected.add(89);
         //Then
         Assert.assertEquals(expected, actual);
     }
     
}
