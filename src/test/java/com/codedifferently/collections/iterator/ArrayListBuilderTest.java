package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilderTest{
    ArrayListBuilder builder;
    @Before
    public void setUp(){
        builder=new ArrayListBuilder();
    }

    @Test
    public void arrayBuildTest(){
        // Given
        Object[] nums={"String",3,11};
        List<Object> expected=new ArrayList<>();
        expected.add("String");
        expected.add(3);
        expected.add(11);

        // When
        List<Object> actual=builder.buildList(nums);


        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void collectionBuildTest(){
        // Given
        Object[] nums={"String",3,11};
        Collection<Object> values= Arrays.asList(nums);
        List<Object> expected=new ArrayList<Object>(values);


        // When
        List<Object> actual=builder.buildList(values);


        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void arraysBuildTest(){
        // Given
        Object[] nums1={"String",3,11};
        Object[] nums2={34,0,"A"};
        Object[] combo={"String",3,11,34,0,"A"};

        List<Object> expected=Arrays.asList(combo);

        // When
        List<Object> actual=builder.buildList(nums1,nums2);


        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void collectionsBuildTest(){
        // Given
        Object[] nums1={"String",3,11};
        Object[] nums2={34,0,"A"};
        Collection<Object> combo= new ArrayList<>();
        Collection<Object> expected1=Arrays.asList(nums1);
        Collection<Object> expected2= Arrays.asList(nums2);
        combo.addAll(expected1);
        combo.addAll(expected2);
        List<Object> expected=new ArrayList<Object>(combo);

        // When
        List<Object> actual=builder.buildList(expected1,expected2);


        // Then
        Assert.assertEquals(expected,actual);
    }

}
