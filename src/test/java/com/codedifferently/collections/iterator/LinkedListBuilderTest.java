package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class LinkedListBuilderTest
{
    @Test
    public void buildListWithArray()
    {
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();

        Integer[] i = {1, 2, 3, 4, 5};

        Assert.assertEquals(i.length, linkedListBuilder.buildList(i).size());
    }

    @Test
    public void buildListWithCollection()
    {
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        Assert.assertEquals(arrList.size(), linkedListBuilder.buildList(arrList).size());
        Assert.assertEquals(arrList, linkedListBuilder.buildList(arrList));

    }

    @Test
    public void buildListWithTwoArrays()
    {
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();

        Integer[] i = {1, 2, 3, 4, 5};
        Integer[] i2 = {6, 7, 8, 9, 10};

        Assert.assertEquals(i.length + i2.length, linkedListBuilder.buildList(i, i2).size());
    }

    @Test
    public void buildListWithTwoCollections()
    {
        LinkedListBuilder linkedListBuilder = new LinkedListBuilder();

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        List<Integer> arrList2 = new ArrayList<>();
        arrList2.add(4);
        arrList2.add(5);
        arrList2.add(6);


        Assert.assertEquals(arrList.size() + arrList.size(),
                linkedListBuilder.buildList(arrList, arrList2).size());
    }
}
