package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBuilderTest {
    ArrayListBuilder arrList;

    @Before
    public void setup() {
        arrList = new ArrayListBuilder();
    }

    @Test
    public void buildListWithObjectArrayTest() {
        int expectedNumReturned = 2;
        Integer[] inputArray = {2};

        List<Integer> newArrList = arrList.buildList(inputArray);
        int actualNumReturned = newArrList.get(0);

        Assert.assertEquals(expectedNumReturned, actualNumReturned);
    }

    @Test
    public void buildListWithCollectionTest() {
        int expectedNum = 56;
        ArrayList<Integer> collection = new ArrayList<Integer>();
        collection.add(56);

        List<Integer> newList = arrList.buildList(collection);
        int actualNum = newList.get(0);

        Assert.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void buildListWithTwoObjectArraysTest() {

    }

    @Test
    public void buildListWithTwoCollectionsTest() {

    }
}
