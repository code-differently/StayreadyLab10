package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LinkedListBuilderTest {
    @Test
    public void buildListTest(){
        List obj = new LinkedList<>();
        obj.add(0);
        obj.add(1);
        obj.add(2);
        ArrayListBuilder builder = new ArrayListBuilder();
        Object[] arr = {0, 1, 2};
        Assert.assertEquals(obj, builder.buildList(arr));
    }
    @Test
    public void buildCollectionTest(){
        List obj = new LinkedList<>();
        obj.add("0");
        obj.add("1");
        obj.add("2");
        ArrayListBuilder builder = new ArrayListBuilder();
        Collection c = new LinkedList<>();
        c.add("3");
        c.add("4");
        c.add("5");
        Assert.assertNotEquals(obj, builder.buildList(c));
    }
    @Test
    public void buildListTwoObjectsTest(){
        List obj = new LinkedList<>();
        obj.add(0);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        ArrayListBuilder builder = new ArrayListBuilder();
        Object[] arr = {0, 1, 2};
        Object[] arr2 = {3, 4, 5};
        Assert.assertEquals(obj, builder.buildList(arr, arr2));
    }
    @Test
    public void buildListCollectionsTest(){
        List obj = new LinkedList<>();
        obj.add(0);
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        ArrayListBuilder builder = new ArrayListBuilder();
        Collection arr = new LinkedList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        Collection arr1 = new LinkedList<>();
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        Assert.assertEquals(obj, builder.buildList(arr, arr1));
    }
}
