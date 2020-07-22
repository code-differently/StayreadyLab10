package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListBuilderTest {

    @Test
    public void buildListTest(){
        // Given
        LinkedListBuilder linkedList = new LinkedListBuilder();
        // When
        Integer[] myArr = {100, 1000, 10000, 100000};
        // Then
        Assert.assertEquals(myArr.length, linkedList.buildList(myArr).size());
    }

    @Test
    public void buildListCollectionsTest(){
        // Given
        LinkedListBuilder linkedList = new LinkedListBuilder();
        // When
        Integer[] ar = {12, 13, 14, 15};
        // Then
        Assert.assertEquals(ar.length, linkedList.buildList(ar).size());
    }

    @Test
    public void buildListTestTwo(){
        // Given
        LinkedListBuilder linkedList = new LinkedListBuilder();
        // When
        Integer[] arr = {50, 12, 11, 27};
        Integer[] arr2 = {65, 25, 32, 35};
        long expected = arr.length + arr2.length;
        // Then
        Assert.assertEquals(expected, linkedList.buildList(arr, arr2).size());
    }

    @Test
    public void buildCollectionsTwo(){
        // Given
        LinkedListBuilder linkedList = new LinkedListBuilder();
        // When
        Integer [] ar = {1,3,5,7,9};
        Integer [] ar2 = {2, 4, 6, 8, 10};
        long expected = ar.length + ar2.length;
        // Then
        Assert.assertEquals(expected, linkedList.buildList(ar, ar2).size());
    }
}
