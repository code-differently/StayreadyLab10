package com.codedifferently.collections.listbuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBuilder implements ListBuilder {

  //constructor
  public LinkedListBuilder(){

  }

  public List buildList(Object[] a) {
    List<Object> list = new LinkedList<Object>();
    list = Arrays.asList(a);
    
    return list ;
  }

  public List buildList(Collection c) {
    List<Collection> list = new LinkedList<Collection>();
    list = Arrays.asList(c); 

    return list;
  }

  public List buildList(Object[] a, Object[] ab) {
    List<Object> list = new LinkedList<Object>();
    Collections.addAll(list, a, ab); //adding the ending part to the list 

    return list ; //a collection of 2 object arrays with size == 2
  }

  public List buildList(Collection c, Collection c2) {
    List<Collection> list = new LinkedList<Collection>();
    Collections.addAll(list, c, c2);

    return list; //a collection of 2 collections with size == 2
  }
  
  
}