package com.codedifferently.collections.iterator;

import org.junit.Test;
import org.junit.Assert;

public class FibonacciIteratorTest {
    @Test
    public void testingfibonaccisteps(){
        FibonacciIterator fibdemo = new FibonacciIterator();
        int counter = 0;
        int lastfibonnaciscore = 0;
        if(counter < 4 && fibdemo.hasNext()){
            lastfibonnaciscore += fibdemo.next();
            System.out.print(lastfibonnaciscore);
            counter ++;
        }
        int total = 1;
        Assert.assertEquals(total,lastfibonnaciscore);
    }
}
