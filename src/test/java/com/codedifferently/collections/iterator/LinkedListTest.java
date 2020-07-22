package com.codedifferently.collections.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import com.codedifferently.collections.LinkedListBuilder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    LinkedListBuilder linkedList;

    @Before 
    public void initialization(){
        linkedList = new LinkedListBuilder();
    }
    

    @Test
    public void buildListTest() {
        //Given
        Object[] listOb = {3,4,5};
        Integer expected = listOb.length;

        //When 
        List<Object> list = linkedList.buildList(listOb);
        LinkedList<Object> linked = new LinkedList<Object>(list);
        Integer actual = linked.size();

        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildListTest2()
    {
        //Given
        Object[] list1 = {3,4,5};
        Object[] list2 = {6,7,8};
        Integer expected = list1.length + list2.length;

        //When 
        List<Object> list = linkedList.buildList(list1, list2);
        LinkedList<Object> linked = new LinkedList<Object>(list);
        Integer actual = linked.size();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildListTest3()
    {
        //Given
        Collection<Object> collection  = new LinkedList<Object>();
        
        collection.add(90);
        collection.add(4);
        Integer expected = collection.size();

        //When 
        List<Object> list = linkedList.buildList(collection);
        LinkedList<Object> linked = new LinkedList<Object>(list);
        Integer actual = linked.size();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void buildListTest4()
    {
        //Given
        Collection<Object> collection  = new LinkedList<Object>();
        collection.add(50);
        collection.add(10);
        Collection<Object> num = new HashSet<Object>();
        num.add(9);
        num.add(8);
        Integer expected = collection.size() + num.size();

        //When 
        List<Object> list = linkedList.buildList(collection, num);
        LinkedList<Object> linked = new LinkedList<Object>(list);
        Integer actual = linked.size();

        //Then
        Assert.assertEquals(expected, actual);


    }
    
}