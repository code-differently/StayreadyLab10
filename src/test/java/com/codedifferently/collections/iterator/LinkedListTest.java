package com.codedifferently.collections.iterator;

import com.codedifferently.collections.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListTest {


    LinkedListBuilder aLinkedListBuilder;
    @Before
    public void setup() {
        this.aLinkedListBuilder = new LinkedListBuilder();
    }

    @Test
    public void buildListArray(){
        // Given
        LinkedList<Object> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add("Hi");

        // When
        Object[] objectArray = {1,2,3,4,"Hi"};

        // Then
        Assert.assertEquals(linkedList,aLinkedListBuilder.buildList(objectArray));
    }

    @Test
    public void buildListCollectionTest(){
        // Given
        LinkedList<Object> linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);

        // When
        Collection<Object> collection = new ArrayList();
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);

        // Then
        Assert.assertEquals(linkedList,aLinkedListBuilder.buildList(collection));
    }


    @Test
    public void buildListCombineArrayTest(){
        // Given
        LinkedList<Object> linkedList = new LinkedList();
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add("Multiply");

        ArrayList<Object> linkList2 = new ArrayList();
        linkList2.add(13);
        linkList2.add(14);
        linkList2.add(15);
        linkList2.add(16);
        linkList2.add("Divide");

        linkedList.addAll(linkList2);

        // When
        ArrayListBuilder anArrayList = new ArrayListBuilder();
        Object[] objectArray = {9,10,11,12, "Multiply"};
        Object[] objectArray2 = {13,14,15,16,"Divide"};

        // Then
        Assert.assertEquals(linkedList, anArrayList.buildList(objectArray,objectArray2));
    }

    @Test
    public void buildListCombineCollection() {
        // Given
        LinkedList<Object> linkedList = new LinkedList();
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add("Multiply");

        LinkedList<Object> linkedList2 = new LinkedList();
        linkedList2.add(13);
        linkedList2.add(14);
        linkedList2.add(15);
        linkedList2.add(16);
        linkedList2.add("Divide");

        linkedList.addAll(linkedList2);

        // When
        Collection <Object> collection = new ArrayList();
        collection.add(9);
        collection.add(10);
        collection.add(11);
        collection.add(12);
        collection.add("Multiply");

        Collection <Object> collection2 = new ArrayList();
        collection2.add(13);
        collection2.add(14);
        collection2.add(15);
        collection2.add(16);
        collection2.add("Divide");

        // Then
        Assert.assertEquals(linkedList, aLinkedListBuilder.buildList(collection,collection2));
    }
}
