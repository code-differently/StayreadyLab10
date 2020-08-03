package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class LinkedListBuilderTest {

    LinkedListBuilder test;
    String expected;
    String actual;

    @Before
    public void setUp(){

        test = new LinkedListBuilder();
        expected = "";
        actual = "";
    }

    @Test
    public void buildListTest() {

        Object [] arr1 = new Object[]{1,2,3,4,5};
        expected = Arrays.toString(arr1);

        actual = test.buildList(arr1).toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest2() {

        Collection<Integer> arr1 = new ArrayList<>();
        arr1.add(1);

        expected = arr1.toString();

        actual = test.buildList(arr1).toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest3() {

        Object [] arr1 = new Object[]{1,2,3,4,5};
        Object [] arr2 = new Object[]{1,2,3,4,5};

        expected = "[1, 2, 3, 4, 5, 1, 2, 3, 4, 5]";

        actual = test.buildList(arr1, arr2).toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildListTest4() {

        Collection<Integer> arr1 = new ArrayList<>();
        Collection<Integer> arr2 = new ArrayList<>();
        arr1.add(1);
        arr2.add(2);

        expected = "[1, 2]";

        actual = test.buildList(arr1, arr2).toString();

        Assert.assertEquals(expected, actual);
    }





}




