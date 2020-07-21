package com.codedifferently.collections.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import com.codedifferently.collections.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Test;


public class LlbTest {
    
    @Test
    public void buildListTest()
    {
        //Given
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();
         Object[] arrObjects = {3,4,5};
        //When 
        LinkedList<Object> linkedList = new LinkedList<Object>(linkedListBuilder.buildList(arrObjects));
        Integer expected = arrObjects.length;
        Integer actual = linkedList.size();
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildListTest2()
    {
        //Given
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();
        Object[] arrObjects = {3,4,5};
        Object[] aObjects2 = {6,7,8};
        //When 
        LinkedList<Object> linkedList = new LinkedList<Object>(linkedListBuilder.buildList(arrObjects, aObjects2));
        Integer expected = arrObjects.length + aObjects2.length;
        Integer actual = linkedList.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildListTest3()
    {
        //Given
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();
        Collection<Object> collection  = new HashSet<Object>();
        collection.add("Nina Simone");
        collection.add("Ray Charles");
        //When 
        LinkedList<Object> linkedList = new LinkedList<Object>(linkedListBuilder.buildList(collection));
        Integer expected = collection.size();
        Integer actual = linkedList.size();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void buildListTest4()
    {
        //Given
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();
        Collection<Object> collection  = new HashSet<Object>();
        collection.add("Nina Simone");
        collection.add("Ray Charles");
        Collection<Object> songs = new HashSet<Object>();
        songs.add("Sinnerman");
        songs.add("What i'd say");
        //When 
        LinkedList<Object> linkedList = new LinkedList<Object>(linkedListBuilder.buildList(collection, songs));
        Integer expected = collection.size() + songs.size();
        Integer actual = linkedList.size();
        Assert.assertEquals(expected, actual);


    }
}