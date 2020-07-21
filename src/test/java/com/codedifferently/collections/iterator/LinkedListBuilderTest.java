package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilderTest {
    LinkedListBuilder linkedListBuilder;
    Integer[] firstArray;
    Integer[] secondArray;
    ArrayList<Integer> firstCollection;
    ArrayList<Integer> secondCollection;

    @Before
    public void setup() {
        linkedListBuilder = new LinkedListBuilder();

        firstArray = new Integer[1];
        secondArray = new Integer[1];
        firstArray[0] = 7;
        secondArray[0] = 23;

        firstCollection = new ArrayList<Integer>();
        secondCollection = new ArrayList<Integer>();
        firstCollection.add(6);
        secondCollection.add(9);
    }

    @Test
    public void buildListWithObjectArrayTest() {
        int expectedNumReturned = 7;

        List newList = linkedListBuilder.buildList(firstArray);
        LinkedList<Integer> newLinkedList = new LinkedList<Integer>(newList);
        int actualNumReturned = newLinkedList.get(0);

        Assert.assertEquals(expectedNumReturned, actualNumReturned);
    }

    @Test
    public void buildListWithCollectionTest() {
        int expectedNum = 6;

        List newList = linkedListBuilder.buildList(firstCollection);
        LinkedList<Integer> newLinkedList =  new LinkedList<Integer>(newList);
        int actualNum = newLinkedList.get(0);

        Assert.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void buildListWithTwoObjectArraysTest() {
        int expectedSize = 2;

        List newList = linkedListBuilder.buildList(firstArray, secondArray);
        LinkedList<Integer> newLinkedList =  new LinkedList<Integer>(newList);
        int actualSize = newLinkedList.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void buildListWithTwoCollectionsTest() {
        int expectedSize = 2;

        List newList = linkedListBuilder.buildList(firstCollection, secondCollection);
        ArrayList<Integer> newLinkedList = new ArrayList<Integer>(newList);
        int actualSize = newLinkedList.size();

        Assert.assertEquals(expectedSize, actualSize);
    }
}
