package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.List;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListBuilderTest {
    
    @Test
    public void buildLinkedListArray(){
        //Given
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();
        //When
        Integer[] i = {5, 6, 7, 8, 9};
        //Then 
        Assert.assertEquals(i.length, linkedListBuilder.buildList(i).size());
    }

    @Test
    public void buildLinkedListTwoArrays(){
        //Given
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();
        //When
        Integer[] i = {5, 6, 7, 8, 9};
        Integer[] ii = {10, 11, 12, 13};
        //Then
        Assert.assertEquals(i.length + ii.length, linkedListBuilder.buildList(i, ii).size());
    }

    @Test
    public void buildLinkedListCollection(){
        //Given
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();
        //When
        List<Object> linkedList = new ArrayList<Object>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        //Then 
        Assert.assertEquals(linkedList.size(), linkedListBuilder.buildList(linkedList).size());
    }

    @Test
    public void buildLinkedListTwoCollections(){
        //Given 
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();
        List<Object> linkedList = new ArrayList<Object>();
        List<Object> linkedList1 = new ArrayList<Object>();
        //When
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList1.add(6);
        linkedList1.add(7);
        linkedList1.add(8);
        //Then 
        Assert.assertEquals(linkedList.size() + linkedList1.size(), linkedListBuilder.buildList(linkedList, linkedList1).size());
    }
}