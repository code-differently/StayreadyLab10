package com.codedifferently.collections.iterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;

import org.junit.Assert;
import org.junit.Test;

public class listTest {
    @Test
    public void buildListTest(){
        //Given
        ArrayListBuilder newListBuilder = new ArrayListBuilder();
        Object[] ray = { 1, 2, 3, 4 };
        //When
        List actual = newListBuilder.buildList(ray);
        List expected = Arrays.asList(ray);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildListTestColl(){
        //Given
        ArrayListBuilder newListBuilder = new ArrayListBuilder();
        Vector<Integer> v = new Vector();
        v.add(3);
        v.add(4);
        //When
        List actual = newListBuilder.buildList(v);
        List expected = Arrays.asList(3,4);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildListTestTwoObjects(){
        //Given
        ArrayListBuilder newListBuilder = new ArrayListBuilder();
        Object[] ray = { 1, 2, 3, 4 };
        Object[] rays = { 5, 6, 7, 8 };
        Object[] raydx = {1,2,3,4,5,6,7,8};
        //When
        List actual = newListBuilder.buildList(ray, rays);
        List expected = Arrays.asList(raydx);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void buildListTestTwoColl(){
        //Given
        ArrayListBuilder newListBuilder = new ArrayListBuilder();
        Vector<Integer> v1 = new Vector();
        Vector<Integer> v2 = new Vector();
        Vector<Integer> v3 = new Vector();
        v1.add(3);
        v2.add(4);
        v3.add(3);
        v3.add(4);
        //When
        List actual = newListBuilder.buildList(v1,v2);
        List expected = Arrays.asList(3,4);
        //Then
        Assert.assertEquals(expected, actual);
    }
}