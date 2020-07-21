package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilderTest {
    @Test
    public void buildListObjectTest(){
        //Given
        List<Object> obj = new ArrayList<Object>();
        obj.add(0);
        obj.add("one");
        obj.add(2);

        //When
        ArrayListBuilder builder = new ArrayListBuilder();
        Object[] arr = {0, "one", 2};
        //Then
        Assert.assertEquals(obj, builder.buildList(arr));
    }
    @Test
    public void buildListCollectionTest(){
        //Given
        List<Object> obj = new ArrayList<Object>();
        obj.add("0");
        obj.add("1");
        obj.add("2");

        //When
        ArrayListBuilder builder = new ArrayListBuilder();
        Collection<Object> c = new ArrayList<Object>();
        c.add("0");
        c.add("1");
        c.add("2");
        //Then
        Assert.assertEquals(obj, builder.buildList(c));
    }
    @Test
    public void buildListTwoObjectsTest(){
        //Given
        List<Object> obj = new ArrayList<Object>();
        obj.add(0);
        obj.add("one");
        obj.add(2);
        obj.add("three");
        obj.add(4);
        obj.add("five");
        //When
        ArrayListBuilder builder = new ArrayListBuilder();
        Object[] arr = {0, "one", 2};
        Object[] arr2 = {"three", 4, "five"};
        //Then
        Assert.assertEquals(obj, builder.buildList(arr, arr2));
    }
    @Test
    public void buildListTwoCollectionsTest(){
        //Given
        List<Object> obj = new ArrayList<Object>();
        obj.add(0);
        obj.add("one");
        obj.add(2);
        obj.add("three");
        obj.add(4);
        obj.add("five");
        //When
        ArrayListBuilder builder = new ArrayListBuilder();
        Collection<Object> arr = new ArrayList<Object>();
        arr.add(0);
        arr.add("one");
        arr.add(2);
        Collection<Object> arr1 = new ArrayList<Object>();
        arr1.add("three");
        arr1.add(4);
        arr1.add("five");
        //Then
        Assert.assertEquals(obj, builder.buildList(arr, arr1));
    }

}
