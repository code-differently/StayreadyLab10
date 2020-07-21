package com.codedifferently.collections.iterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ArrayListBuilderTest
{
    @Test
    public void buildListWithArray()
    {
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Integer[] i = {1, 2, 3, 4, 5};

        Assert.assertEquals(i.length, arrayListBuilder.buildList(i).size());
    }

    @Test
    public void buildListWithCollection()
    {
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        Assert.assertEquals(arrList.size(), arrayListBuilder.buildList(arrList).size());
        Assert.assertEquals(arrList, arrayListBuilder.buildList(arrList));

    }

    @Test
    public void buildListWithTwoArrays()
    {
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Integer[] i = {1, 2, 3, 4, 5};
        Integer[] i2 = {6, 7, 8, 9, 10};

        Assert.assertEquals(i.length + i2.length, arrayListBuilder.buildList(i, i2).size());
    }

    @Test
    public void buildListWithTwoCollections()
    {
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        List<Integer> arrList2 = new ArrayList<>();
        arrList2.add(4);
        arrList2.add(5);
        arrList2.add(6);


        Assert.assertEquals(arrList.size() + arrList.size(),
                arrayListBuilder.buildList(arrList, arrList2).size());
    }
}
