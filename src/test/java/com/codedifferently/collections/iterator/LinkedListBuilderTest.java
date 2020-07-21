package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class LinkedListBuilderTest {
    LinkedListBuilder lb = new LinkedListBuilder();
    Integer[] arr1 = {1, 2, 3, 4, 5};
    Integer[] arr2 = {4, 5, 6, 7, 8};
    String[] col1Words = {"hi, bye, sigh, why"};
    String[] col2Words = {"try, lie, pie, tie"};
    Collection<String> col1 = new ArrayList<>(Arrays.asList(col1Words));
    Collection<String> col2 = new ArrayList<>(Arrays.asList(col2Words));

    // Instance Of Tests
    @Test
    public void buildListTest() {
        Assert.assertTrue(lb.buildList(arr1) instanceof List);
    }

    @Test
    public void buildListTest2() {
        Assert.assertTrue(lb.buildList(col1) instanceof List);
    }

    @Test
    public void buildListTest3() {
        Assert.assertTrue(lb.buildList(arr1, arr2) instanceof List);
    }

    @Test
    public void buildListTest4() {
        Assert.assertTrue(lb.buildList(col1, col2) instanceof List);
    }

    // List size tests
    public void buildListTest5() {
        int expectedSize = 5;

        Assert.assertEquals(expectedSize, lb.buildList(arr1).size());
    }

    @Test
    public void buildListTest6() {
        int expectedSize = 1;

        Assert.assertEquals(expectedSize, lb.buildList(col1).size());
    }

    @Test
    public void buildListTest7() {
        int expectedSize = 10;

        Assert.assertEquals(expectedSize, lb.buildList(arr1, arr2).size());
    }

    @Test
    public void buildListTest8() {
        int expectedSize = 2;

        Assert.assertEquals(expectedSize, lb.buildList(col1, col2).size());
    }
}
