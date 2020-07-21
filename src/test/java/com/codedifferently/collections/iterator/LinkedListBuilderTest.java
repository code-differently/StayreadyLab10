package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListBuilderTest {

    @Test
    public void buildListTest(){
        //Given
        LinkedListBuilder alb = new LinkedListBuilder();
        Object[] a = {1, 2, 3, 4};
        //When
        List actual = alb.buildList(a);
        List<Object> expected = new LinkedList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void buildListTest2(){
        //Given
        LinkedListBuilder alb = new LinkedListBuilder();
        List col = new Vector();
        col.add(1);
        col.add(2);
        //When
        List actual = alb.buildList(col);
        LinkedList<Object> expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void buildListTest3(){
        //Given
        LinkedListBuilder alb = new LinkedListBuilder();
        Object[] a1 = {1,2,3,4};
        Object[] a2 = {5,6,7,8};
        //When
        List actual = alb.buildList(a1, a2);
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
    public void buildListTest4(){
        //Given
        LinkedListBuilder alb = new LinkedListBuilder();
        List col = new Vector();
        col.add(1);
        col.add(2);
        List col2 = new Vector();
        col2.add(3);
        col2.add(4);
        //When
        List actual = alb.buildList(col, col2);
        LinkedList<Object> expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        //Then
        Assert.assertEquals(expected,actual);
    }

}
