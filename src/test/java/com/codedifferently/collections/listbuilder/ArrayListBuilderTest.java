package com.codedifferently.collections.listbuilder;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ArrayListBuilderTest 
{
    ArrayListBuilder builder;

    @Before
    public void starter()
    {
        builder = new ArrayListBuilder();
    }

 @Test
 public void buildList1()
 {
     //given
     Object[] a = {1,2,3,4};

     //when
     List <Object> expected = Arrays.asList(a);
     List <Object> actual = builder.buildList(a);

     //then
     assertEquals(expected, actual);
 }

 @Test
 public void buildList2()
 {
     //given
     Object[] a = {1,2,3,4};
     Object[] b = {5,6,7,8};

     //when
     List <Object> list = builder.buildList(a , b);
     Integer expected = a.length + b.length;
     Integer actual = list.size();

     //then
     assertEquals(expected, actual);
 }

 @Test
 public void buildList3()
 {
     //given
     Collection <Object> c = new HashSet<Object>();
     c.add("Taia");
     c.add("Williams-Rivera");

     //when
     List <Object> list = builder.buildList(c);
     Integer actual = list.size();
     Integer expected = c.size();
     //then
     assertEquals(expected, actual);
 }
 
 @Test
 public void buildTest4()
 {  
     //given
    Object [] part1 = {1,2,3};
    Object [] part2 = {4,5,6};
    Collection<Object> result = new ArrayList<Object>();
    Collection <Object> a = Arrays.asList(part1);
    Collection <Object> b = Arrays.asList(part2);
    result.addAll(a);
    result.addAll(b);

    //when
    List <Object> listactual = builder.buildList(a, b);
    List <Object> listexpected = new ArrayList<Object>(result);

    assertEquals(listexpected, listactual);
 }
}