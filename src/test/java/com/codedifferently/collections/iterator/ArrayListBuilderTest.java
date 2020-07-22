package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.codedifferently.collections.ArrayListBuilder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListBuilderTest {
    ArrayListBuilder arrayList;

    @Before
    public void initialize() {
        arrayList = new ArrayListBuilder();
    }

    @Test
    public void buildTest() {
        //Given
        Object [] arr = {3, 4, 5};
        List<Object> list = arrayList.buildList(arr);
        Integer expected = arr.length;

        //When
        Integer actual = list.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildTest1() {
        //Given
        Object [] arr = {3, 4, 5};
        Collection<Object> collect = arrayList.buildList(arr);
        Integer expected = arr.length;

        //When
        Integer actual = collect.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildTest2() {
        
        //Given
        ArrayList<Object> expected = new ArrayList<Object>();

        expected.add(3);
        expected.add(4);
        expected.add(5);
        
        //When
        List<Object> actual = arrayList.buildList(expected);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buildTest3() {
        //Given
        Collection<Object> collect = new ArrayList<Object>();
        collect.add(2);
        collect.add(4);
        collect.add(6);

        //When
        List<Object> list = arrayList.buildList(collect);
        Integer actual = list.size();
        Integer expected = collect.size();

        //Then
        Assert.assertEquals(expected, actual);
    }
    
}