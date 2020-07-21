package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBuilderTest {
    ArrayListBuilder arrListBuilder;
    Integer[] firstArray;
    Integer[] secondArray;
    ArrayList<Integer> firstCollection;
    ArrayList<Integer> secondCollection;

    @Before
    public void setup() {
        arrListBuilder = new ArrayListBuilder();

        firstArray = new Integer[1];
        secondArray = new Integer[1];
        firstArray[0] = 2;
        secondArray[0] = 5;

        firstCollection = new ArrayList<Integer>();
        secondCollection = new ArrayList<Integer>();
        firstCollection.add(56);
        secondCollection.add(12);
    }

    @Test
    public void buildListWithObjectArrayTest() {
        int expectedNumReturned = 2;

        List newList = arrListBuilder.buildList(firstArray);
        ArrayList<Integer> newArrList = new ArrayList<Integer>(newList);
        int actualNumReturned = newArrList.get(0);

        Assert.assertEquals(expectedNumReturned, actualNumReturned);
    }

    @Test
    public void buildListWithCollectionTest() {
        int expectedNum = 56;

        List newList = arrListBuilder.buildList(firstCollection);
        ArrayList<Integer> newArrList =  new ArrayList<Integer>(newList);
        int actualNum = newArrList.get(0);

        Assert.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void buildListWithTwoObjectArraysTest() {
        int expectedSize = 2;

        List newList = arrListBuilder.buildList(firstArray, secondArray);
        ArrayList<Integer> newArrList =  new ArrayList<Integer>(newList);
        int actualSize = newArrList.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void buildListWithTwoCollectionsTest() {
        int expectedSize = 2;

        List newList = arrListBuilder.buildList(firstCollection, secondCollection);
        ArrayList<Integer> newArrList = new ArrayList<Integer>(newList);
        int actualSize = newArrList.size();

        Assert.assertEquals(expectedSize, actualSize);
    }
}
