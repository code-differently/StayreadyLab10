package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class FibonacciIteratorTest {

    @Test
    public void nextTest(){
        //Given
        FibonacciIterator fi = new FibonacciIterator();
        int index = 0;
        //When
        fi.next();
        fi.next();
        fi.next();
        index = fi.next();
        int expected = 3;
        int actual = index;
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void hasNextTest(){
        //Given
        FibonacciIterator fi = new FibonacciIterator();
        //When
        fi.next();
        fi.next();
        fi.next();
        boolean actual = fi.hasNext();
        //Then
        Assert.assertEquals(true, actual);
    }

    @Test
    public void buildListTest(){
        //Given
        ArrayListBuilder alb = new ArrayListBuilder();
        Object[] a = {1,2,3,4};

        //When
        List actual = alb.buildList(a);
        ArrayList<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest2(){
        //Given
        ArrayListBuilder alb = new ArrayListBuilder();
        List col = new Vector();
        col.add(1);
        col.add(2);

        //When
        List actual = alb.buildList(col);
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void buildListTest3(){
        //Given
        ArrayListBuilder alb = new ArrayListBuilder();
        Object[] a1 = {1,2,3,4};
        Object[] a2 = {5,6,7,8};

        //When
        List actual = alb.buildList(a1, a2);
        ArrayList<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest4(){
        //Given
        ArrayListBuilder alb = new ArrayListBuilder();
        List col = new Vector();
        col.add(1);
        col.add(2);
        List col2 = new Vector();
        col2.add(3);
        col2.add(4);

        //When
        List actual = alb.buildList(col, col2);
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void buildListTest5(){
        //Given
        LinkedListBuilder llb = new LinkedListBuilder();
        Object[] a = {1,2,3,4};

        //When
        List actual = llb.buildList(a);
        LinkedList<Object> expected = new LinkedList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest6(){
        //Given
        LinkedListBuilder llb = new LinkedListBuilder();
        List col = new Vector();
        col.add(1);
        col.add(2);

        //When
        List actual = llb.buildList(col);
        LinkedList<Object> expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest7(){
        //Given
        LinkedListBuilder llb = new LinkedListBuilder();
        Object[] a1 = {1,2,3,4};
        Object[] a2 = {5,6,7,8};

        //When
        List actual = llb.buildList(a1, a2);
        LinkedList<Object> expected = new LinkedList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest8(){
        //Given
        LinkedListBuilder llb = new LinkedListBuilder();
        List col = new Vector();
        col.add(1);
        col.add(2);
        List col2 = new Vector();
        col2.add(3);
        col2.add(4);

        //When
        List actual = llb.buildList(col, col2);
        LinkedList<Object> expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        //Then
        Assert.assertEquals(expected,actual);
    }
}
