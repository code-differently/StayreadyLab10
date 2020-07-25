package com.codedifferently.collections.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.codedifferently.collections.listbuilder.LinkedListBuilder;

import org.junit.*;


public class LinkedListBuilderTest {
  Object[] a = {1, 2, 3};
  Object[] b = {5, 6};
  LinkedListBuilder lb = new LinkedListBuilder();
  Collection <Integer> arr;
  Collection <Integer> arr2;


  @Before 
  public void instantiate(){
    arr = new ArrayList<Integer>();
    arr.add(5);
    arr2 = new ArrayList<Integer>(); 
    arr2.add(5);
    arr2.add(6);
  }
  

  @Test
  public void buildList1Test(){
    List<Object> l = lb.buildList(a); 
    int expected = a.length;

    int actual = l.size();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void buildList2Test(){
    List<Integer> l = lb.buildList(arr); 
    int expected = 1;
    
    int actual = l.size();

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void buildList3Test(){
    List<Object> l = lb.buildList(a, b);

    int expected = 2;

    int actual = l.size();

    Assert.assertEquals(expected, actual);

  }

  @Test
  public void buildList4Test(){
    List<Object> l = lb.buildList(arr, arr2);

    int expected = 2;

    int actual = l.size();

    Assert.assertEquals(expected, actual);    
  }




  
}