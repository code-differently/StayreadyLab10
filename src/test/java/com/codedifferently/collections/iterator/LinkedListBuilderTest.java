package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilderTest {

    @Test
    public void arrayToLinkedListTest(){
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Integer[] testCase = {0,1,2,3};
        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);

        Assert.assertEquals(expected,arrayListBuilder.buildList(testCase));

    }

    @Test
    public void collectionToLinkedListTest(){
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Integer[] testCase = {0,1,2};
        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(0);
        expected.add(1);
        expected.add(2);

        Assert.assertEquals(expected,arrayListBuilder.buildList(testCase));

    }

    @Test
    public void combineTwoArraysToLinkedList(){
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Integer[] testCase1 = {0,1,2};
        Integer[] testCase2 = {10,9,8,7};
        LinkedList<Integer> expected = new LinkedList<Integer>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(10);
        expected.add(9);
        expected.add(8);
        expected.add(7);

        Assert.assertEquals(expected,arrayListBuilder.buildList(testCase1,testCase2));

    }

    @Test
    public void combineTwoCollectionsToLinkedList(){
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();

        List<Integer> testcase1 = new LinkedList<Integer>();
        testcase1.add(0);
        testcase1.add(1);
        testcase1.add(2);
        List<Integer> testcase2 = new LinkedList<Integer>();
        testcase2.add(10);
        testcase2.add(9);
        testcase2.add(8);

        List<Integer> expected = new LinkedList<Integer>();
        expected.addAll(testcase1);
        expected.addAll(testcase2);

        Assert.assertEquals(expected,
                linkedListBuilder.buildList(testcase1,testcase2));

    }

}