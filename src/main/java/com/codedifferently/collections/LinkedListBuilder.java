package com.codedifferently.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.codedifferently.collections.listbuilder.ListBuilder;

public class LinkedListBuilder implements ListBuilder{

    public List<Object>buildList(Object[] a) {
        LinkedList<Object> listL = new LinkedList<Object>(Arrays.asList(a));
        return listL;
    }
    public List<Object>buildList(Collection<Object> c) {
        LinkedList<Object> listL = new LinkedList<Object>(c);
        return listL;
    }
    public List<Object>buildList(Object[] a1, Object[] a2) {
        LinkedList<Object> list1 = new LinkedList<Object>(Arrays.asList(a1));
        list1.addAll(Arrays.asList(a2));
        return list1;
    }
    public List<Object>buildList(Collection<Object> c1, Collection<Object> c2) {
        LinkedList<Object> listL = new LinkedList<Object>(c1);
        listL.addAll(c2);
        return listL;
    }
    
}