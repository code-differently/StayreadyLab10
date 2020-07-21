package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilderTest {

    LinkedListBuilder llb;
    @Before
    public void initialize() {
        llb = new LinkedListBuilder();
    }

    @Test
    public void buildList1ObjectArrayTest() {
        // Given
        Object[] arr = {1, 3, 5};

        // When
        LinkedList<Object> linkedList = llb.buildList(arr);

        // Then
        for(int i = 0; i < linkedList.size(); i++)
            Assert.assertEquals(linkedList.get(i), arr[i]);
    }

    @Test
    public void buildList1CollectionTest() {
        // Given
        List<Object> collection = new ArrayList<>();
        collection.add(1);
        collection.add(3);
        collection.add(5);

        // When
        LinkedList<Object> linkedList = llb.buildList(collection);

        // Then
        for(int i = 0; i < linkedList.size(); i++)
            Assert.assertEquals(linkedList.get(i), collection.get(i));
    }

    @Test
    public void buildList2ObjectArraysTest() {
        // Given
        Object[] arr1 = {1, 3, 5};
        Object[] arr2 = {2, 4, 6};

        // When
        LinkedList<Object> linkedList = llb.buildList(arr1, arr2);

        // Then
        for(int i = 0; i < linkedList.size(); i++) {
            if (i < arr1.length)
                Assert.assertEquals(linkedList.get(i), arr1[i]);
            else
                Assert.assertEquals(linkedList.get(i), arr2[i - arr1.length]);
        }
    }

    @Test
    public void buildList2CollectionsTest() {
        // Given
        List<Object> collection1 = new ArrayList<>();
        collection1.add(1);
        collection1.add(3);
        collection1.add(5);
        List<Object> collection2 = new ArrayList<>();
        collection2.add(2);
        collection2.add(4);
        collection2.add(6);

        // When
        LinkedList<Object> linkedList = llb.buildList(collection1, collection2);

        // Then
        for(int i = 0; i < linkedList.size(); i++) {
            if (i < collection1.size())
                Assert.assertEquals(linkedList.get(i), collection1.get(i));
            else
                Assert.assertEquals(linkedList.get(i), collection2.get(i - collection1.size()));
        }
    }

}