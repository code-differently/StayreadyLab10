package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListBuilder implements ListBuilder {
  

  public List buildList(Object[] a) {
    List<Object> list = new ArrayList<Object>();
    list = Arrays.asList(a);
    return list;
  }

  public List buildList(Collection c) {
    List<Collection> list = new ArrayList<Collection>();
    list = Arrays.asList(c);
    return list; 
  }

  public List buildList(Object[] a, Object[] ab) {
    List<Object> list = new ArrayList<Object>();
    Collections.addAll(list, a, ab);
    return list;
  }

  public List buildList(Collection c, Collection c2) {
    List<Collection> list = new ArrayList<Collection>();
    Collections.addAll(list, c, c2);
    return list;
  }
  
}