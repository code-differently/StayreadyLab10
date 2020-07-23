package com.codedifferently.collections.iterator;

import com.codedifferently.collections.listbuilder.ListBuilder;

import java.util.*;

public class LinkedListBuilder implements ListBuilder {
    public List buildList(Object[] a) {
        List<Object> newList = new LinkedList <Object>(Arrays.asList(a));
        return newList;
    }
    public List buildList(Collection c) {
        List<Collection> newList = new LinkedList<Collection>();
        newList.addAll(c);
        return newList;
    }
    public List buildList(Object[] a1, Object[] a2) {
        List<Object> newList = new LinkedList<Object>(Arrays.asList(a1));
        newList.addAll(Arrays.asList(a2));
        return newList;
    }
    public List buildList(Collection c1, Collection c2) {
        List<Collection> newList = new LinkedList<Collection>();
        newList.addAll(c1);
        newList.addAll(c2);
        return newList;
    }
}