package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilderTest {

    @Test
    public void  arrayToListTest(){
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Integer[] testCase = {0,2,5,93,23};
        List<Integer> expected = Arrays.asList(0,2,5,93,23);

        Assert.assertEquals(expected,arrayListBuilder.buildList(testCase));

    }

    @Test
    public void collectionToListTest(){
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Integer[] testCase = {0,1,2};
        List<Integer> expected = Arrays.asList(0,1,2);

        Assert.assertEquals(expected,arrayListBuilder.buildList(testCase));

    }

    @Test
    public void combineTwoArraysToListTest(){
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Integer[] testCase1 = {0,1,2};
        Integer[] testCase2 = {4,5};
        List<Integer> expected = Arrays.asList(0,1,2,4,5);

        Assert.assertEquals(expected,arrayListBuilder.buildList(testCase1,testCase2));

    }

    @Test
    public void combineTwoCollectionsToListTest(){
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Integer[] testCase1 = {10,11,12};
        Integer[] testCase2 = {14,15};
        List<Integer> expected = Arrays.asList(10,11,12,14,15);

        Assert.assertEquals(expected,arrayListBuilder.buildList(testCase1,testCase2));

    }
}
