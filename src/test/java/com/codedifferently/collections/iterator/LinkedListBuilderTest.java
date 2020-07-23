package com.codedifferently.collections.iterator;


import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListBuilderTest {
    @Test
    public void buildListTest(){
        //Given
        LinkedListBuilder tester = new LinkedListBuilder();
        Object[] test = {1, 2, 3, 4};
        //When
        List actual = tester.buildList(test);
        LinkedList<Object> expected = new LinkedList <Object>();
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
        LinkedListBuilder tester = new LinkedListBuilder();
        List test = new Vector();
        test.add(1);
        test.add(2);
        //When
        List actual = tester.buildList(test);
        LinkedList<Object> expected = new LinkedList <Object>();
        expected.add(1);
        expected.add(2);
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void buildListTest3(){
        //Given
        LinkedListBuilder tester = new LinkedListBuilder();
        Object[] test1 = {1,2,3,4};
        Object[] test2 = {5,6,7,8};
        //When
        List actual = tester.buildList(test1, test2);
        LinkedList<Object> expected = new LinkedList <Object>();
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
        LinkedListBuilder tester = new LinkedListBuilder();
        List test1 = new Vector();
        test1.add(1);
        test1.add(2);
        List test2 = new Vector();
        test2.add(3);
        test2.add(4);
        //When
        List actual = tester.buildList(test1, test2);
        LinkedList<Object> expected = new LinkedList <Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        //Then
        Assert.assertEquals(expected,actual);
    }
}

